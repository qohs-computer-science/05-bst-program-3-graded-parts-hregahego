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
        String add = "BCAGDEIHY";
        for (char c : add.toCharArray()) {
            test.add(c);
        }
//          B
//         / \
//        A   C
//             \
//              G
//             /  \
//            D     I
//             \   /  \
//              E H    Y
//
        // TreeNode result = (TreeNode) test.findHelper('G', null, test.getRoot()).get(1);
        // System.out.println(result.getValue());
        // test.delete('');
        test.delete('G');
        test.printPreOrder();
    }
}