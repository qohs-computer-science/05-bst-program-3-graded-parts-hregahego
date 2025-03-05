/*
 * TODO: Name
 * TODO: Date
 * TODO: Class Period
 * TODO: Program Description
 */

import java.lang.Comparable;

public class BSTTester {
    public static void main(String[] args) {
        BST test = new BST();
        String add = "ORCHARDQUINCE";
        for (char c : add.toCharArray()) {
            test.add(c);
        } // loop through chararray to add each letter

        System.out.println("Size of tree: " + test.size());
        System.out.println("Is tree empty? "  + test.isEmpty());

        System.out.println("Preorder Traversal");
        test.printPreOrder();
        System.out.println("Inorder Traversal");
        test.printInOrder();
        System.out.println("Postorder Traversal");
        test.printPostOrder();

        System.out.println("Find Z: " + test.find('Z'));
        System.out.println("Find Q: " + test.find('Q'));

        System.out.println("================================================");
        System.out.println("Deleting D: ");
        test.delete('D');
        test.printInOrder();
        System.out.println("Replacing Q with Y: ");
        test.replace('Q', 'Y');
        test.printInOrder();
        System.out.println("Final size: " + test.size());


    } // end main
} // end class