import java.lang.Comparable;
// import java.util.Stack;
import java.util.*;


public class BST implements BSTInterface
{
    private int size;
    private TreeNode root;
    
    public BST() {
        root = null;
    }

    public TreeNode getRoot() { 
        return root; 
    }

    public int size() {
        return size;
    }
	

	public boolean isEmpty() {
        if (size > 0) return true;
        return false;
    }
	

	public void add(Comparable newVal) {
        TreeNode addTo = root;
        if (addTo == null) root = new TreeNode(newVal);
        while (addTo != null) {
            if (newVal.compareTo(addTo.getValue()) <= 0) {
                if (addTo.getLeft() == null) {
                    addTo.setLeft(new TreeNode(newVal));
                    return;
                } else {
                    addTo = addTo.getLeft();
                }
            } else {
                if (addTo.getRight() == null) {
                    addTo.setRight(new TreeNode(newVal));
                    return;
                } else {
                    addTo = addTo.getRight();
                }
            }
        }
    }

	public boolean find(Comparable toFind) {
        return (boolean) findHelper(toFind, null, root).get(0);
    }
    
    public List<Object> findHelper(Comparable value, TreeNode prev, TreeNode cur) {
        try {
            if (value.compareTo(cur.getValue()) == 0) return Arrays.asList(true, prev, cur);
        } catch (Exception e) {
            return Arrays.asList(false, null, null);
        }

        if (value.compareTo(cur.getValue()) < 0) {
            return findHelper(value, cur, cur.getLeft());
        } else {
            return findHelper(value, cur, cur.getRight());
        }
    }

	public boolean replace(Comparable old, Comparable toAdd) {
        return true;
    }

    private int wahoo(Object x) {
        return (x == null) ? 0 : 1;
    }
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
        }
        
        switch (numChildren) {
            case 0:
                if (isLeftChild) {
                    parent.setLeft(null);
                } else {
                    parent.setRight(null);
                }
                break;
            
            case 1:
                TreeNode child = (target.getLeft() == null) ? target.getRight() : target.getLeft();
                if (isLeftChild) {
                    parent.setLeft(child);
                } else {
                    parent.setRight(child);
                }
                break;

            case 2:
                TreeNode LC = target.getLeft();
                TreeNode RC = target.getRight();

                TreeNode rightmost = LC;
                while (rightmost.getRight() != null) {
                    rightmost = rightmost.getRight();
                }

                rightmost.setRight(RC);
                target.setValue(LC.getValue());
                target.setLeft(LC.getLeft());
                target.setRight(LC.getRight());
        }
        return true;

    }

	public void printInOrder() {
        inorder(root);
    }
    private void inorder(TreeNode sub) {
        if (sub.getLeft() != null) {
            inorder(sub.getLeft());
        }
        System.out.println(sub.getValue());
        if (sub.getRight() != null) {
            inorder(sub.getRight());
        }
    }
    // private void printStk(Stack<TreeNode> stk) {
    //     while (!stk.empty()) System.out.println(stk.pop());
    // }
	public void printPreOrder() {
        Stack<TreeNode> stk = new Stack<TreeNode>();
        stk.push(root);
        TreeNode cur;
        while (!stk.empty()) {
            cur = stk.pop();
            if (cur != null) {
                System.out.println(cur.getValue());
                stk.push(cur.getRight());
                stk.push(cur.getLeft());
            }
        }
    }

	public void printPostOrder() {
        postorder(root);
    }
    private void postorder(TreeNode sub) {
        if (sub.getLeft() != null) {
            postorder(sub.getLeft());
        } if (sub.getRight() != null) {
            postorder(sub.getRight());
        }
        System.out.println(sub.getValue());
    }


}