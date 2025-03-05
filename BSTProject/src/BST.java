import java.lang.Comparable;
// import java.util.Stack;
import java.util.*;


public class BST implements BSTInterface
{
    private int size;
    private TreeNode root;
    
    public BST() {
        root = null;
        size = 0;
    } // Creates tree with root node as null and size 0

    public TreeNode getRoot() { 
        return root; 
    } // returns root node

    public int size() {
        return size;
    } // returns size field
	

	public boolean isEmpty() {
        return size == 0;
    } // if size is 0, return true
	

	public void add(Comparable newVal) {
        if (root == null) root = new TreeNode(newVal);
        else addHelper(root, newVal);
        size++;
    } // add method; add 1 to size

    private void addHelper(TreeNode sub, Comparable val) {
        if (val.compareTo(sub.getValue()) <= 0) { // if value is less than current subroot, go to left child case
            if (sub.getLeft() == null) { // if there is not already a left child, add the value as a left child
                sub.setLeft(new TreeNode(val));
                return;
            } else { // if there is already a left child, recursion with the left child as the new subroot
                addHelper(sub.getLeft(), val);
            }
        } else { // right child case
            if (sub.getRight() == null) {
                sub.setRight(new TreeNode(val));
            } else {
                addHelper(sub.getRight(), val);
            }
        }
    } // add helper function

	public boolean find(Comparable toFind) {
        return (boolean) findHelper(toFind, null, root).get(0);
    } // returns whether or not toFind was in the tree
    
    public List<Object> findHelper(Comparable value, TreeNode prev, TreeNode cur) {
        try {
            if (value.compareTo(cur.getValue()) == 0) return Arrays.asList(true, prev, cur); 
            // if the target value is equal to cur, return an array of value, previous (parent), and current node
        } catch (Exception e) { // Means that cur is null; searched the entire tree, so value was not found
            return Arrays.asList(false, null, null);
        }

        if (value.compareTo(cur.getValue()) < 0) { // if target value is less or equal to cur, go to the left child
            return findHelper(value, cur, cur.getLeft());
        } else { // right child case
            return findHelper(value, cur, cur.getRight());
        }
    }

	public boolean replace(Comparable old, Comparable toAdd) {
        boolean found = delete(old);
        add(toAdd);
        return found;
    } // Delete old value and add the new value

    private int wahoo(Object x) {
        return (x == null) ? 0 : 1;
    } // if x is null, return 0; else return 1. Used to concisely count number of children nodes
	public boolean delete(Comparable old) {
        
        List<Object> result = findHelper(old, null, root);
        boolean found = (boolean) result.get(0);
        TreeNode parent = (TreeNode) result.get(1);
        TreeNode target = (TreeNode) result.get(2);

        if (!found) return false;
        int numChildren = wahoo(target.getLeft()) + wahoo(target.getRight());
        //System.out.println(numChildren);
        //System.out.println(target.getLeft().getValue() + " " + target.getRight().getValue());
        //int numParentChildren = wahoo(parent.getLeft()) + wahoo(parent.getRight());
        boolean isLeftChild;
        try {
            isLeftChild = (parent.getLeft() == target) ? true : false;
        } catch (Exception e) {
            isLeftChild = false;
        } // determine whether the node to be deleted is a left or right child
        
        switch (numChildren) {
            case 0: // target node has 0 children case
                if (isLeftChild) {
                    parent.setLeft(null);
                } else {
                    parent.setRight(null);
                }
                break;
            
            case 1: // target node has 1 child case
                TreeNode child = (target.getLeft() == null) ? target.getRight() : target.getLeft();
                if (isLeftChild) {
                    parent.setLeft(child);
                } else {
                    parent.setRight(child);
                } // The child node of the parent node is set to the target node's child
                break;

            case 2: // target node has 2 children case
                TreeNode LC = target.getLeft();
                TreeNode RC = target.getRight();

                TreeNode rightmost = LC;
                while (rightmost.getRight() != null) {
                    rightmost = rightmost.getRight();
                } // Gets the rightmost node of the left subtree

                rightmost.setRight(RC);
                target.setValue(LC.getValue());
                target.setLeft(LC.getLeft());
                target.setRight(LC.getRight());
        } // switch statement to handle each case
        size--;
        return true;

    } // method to delete nodes

	public void printInOrder() {
        if (root != null) inorder(root);
    } // prints inorder traversal

    private void inorder(TreeNode sub) {

        if (sub.getLeft() != null) {
            inorder(sub.getLeft());
        } // Traverse left sub tree

        System.out.println(sub.getValue());

        if (sub.getRight() != null) {
            inorder(sub.getRight());
        } // Traverse right sub tree
    } // inorder traversal recursion
    
	public void printPreOrder() {
        if (root != null) preorder(root);
    } // prints preorder traversal

    private void preorder(TreeNode sub) {
        System.out.println(sub.getValue());
        if (sub.getLeft() != null) {
            preorder(sub.getLeft());
        } // traverse left subtree
        if (sub.getRight() != null) {
            preorder(sub.getRight());
        }  // traverse right subtree
    } // preorder traversal recursion

	public void printPostOrder() {
        if (root != null) postorder(root);
    } // pprints postorder traversal
    private void postorder(TreeNode sub) {
        if (sub.getLeft() != null) {
            postorder(sub.getLeft());
        } //traverse left subtree
        
        if (sub.getRight() != null) {
            postorder(sub.getRight());
        } // traverse right subtree
        System.out.println(sub.getValue());
    } // postorder traversal recursion


}