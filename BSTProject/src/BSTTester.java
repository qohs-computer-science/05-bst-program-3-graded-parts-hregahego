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
        String add = "ALGBEIQPS";
        for (char c : add.toCharArray()) {
            test.add(c);
        }
//              A          
//               \
//                L
//               /  \
//              G    Q
//             / \   /\
//            B   I P  S    
//             \
//              E
//
//
//
//
//
        // TreeNode result = (TreeNode) test.findHelper('G', null, test.getRoot()).get(1);
        // System.out.println(result.getValue());
        // test.delete('');
        test.delete('L');
        test.printPreOrder();
    }
}