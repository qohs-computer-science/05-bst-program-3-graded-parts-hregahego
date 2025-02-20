[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/ds87o-E2)
[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=18310389)
<p><strong><span style="background-color: #f1c40f;">PART 1 = fields, Constructor, add, and all 3 traversals - Due 2/24</span></strong></p>
<p><strong><span style="background-color:rgb(56, 179, 77);">PART 2 = delete methods - Due 2/27</span></strong></p>
<p><strong><span style="background-color:rgb(15, 158, 241);">PART 3 = size, isEmpty, find, replace, and all tester file items - Due 3/4</span></strong></p>
<p><strong>Description:</strong><span>&nbsp; You are going to create a BST class that implements the BSTInterface and uses the TreeNode class to create a Binary Search Tree.&nbsp; The class will include the functionality to be constructed, have elements added to it, found within it, replaced, deleted from it, and the tree itself will be traversable.&nbsp; You will then use your class within a testfile to test the functionality of your code.&nbsp; The details for each class as well as an outline for the TreeNode class are below.&nbsp;&nbsp;</span></p>
<p><strong>FULL Directions:</strong></p>
<p><span>Read ALL of the following directions before beginning the program.</span></p>
<ol>
    <li aria-level="1"><span>Create an algorithm/pseudocode for the BST class <strong><em>as outlined by your teacher</em></strong> for the methods you&rsquo;ve been assigned.&nbsp; Keep in mind that the program, if appropriate, should be outlined with what methods it will be calling including modifiers, return types, and parameters specified.</span></li>
    <li aria-level="1"><span>Create the following class &ndash; BST&nbsp;</span>
        <ol>
            <li aria-level="3"><strong>public BST() -</strong> This constructor creates an empty tree (remember to set any values to null)<em><strong> (4 points with proper field creation)</strong></em></li>
            <li aria-level="3"><strong>public int size()</strong><span> returns the current number of nodes that are located in the tree</span></li>
            <li aria-level="3"><strong>public boolean isEmpty()</strong><span> returns true if there are no nodes in the tree and false if there is at least one node in the tree</span></li>
            <li aria-level="3"><strong>public void add(Object) </strong>- Creates a new node to store the value being sent then adds the node to the tree in the correct place (remember all left children are less than or equal to their parent and all right children are greater than their parent). &nbsp;<em><strong> (10 points with proper helper method creation, use of recursion)</strong></em></span></span></li>
            <li aria-level="3"><strong>public boolean find(Object)</strong><span> searches through the tree to determine if the object being passed is a current element in the tree if it is, return true, otherwise, return false</span></li>
            <li aria-level="3"><strong>public boolean replace(Object old, Object toAdd)</strong><span> this method takes an &ldquo;old&rdquo; object &ndash; determines if it is currently in the tree and if it is, removes that object and adds the &ldquo;toAdd&rdquo; object.&nbsp; If the element was successfully replaced then true is returned, if the old object did not exist then false is returned and the toAdd object is added to the BST.&nbsp; Remember that you cannot just replace an element by changing its value because it may not belong at that spot in the tree after being replaced.&nbsp;&nbsp;</span></li>
            <li aria-level="3"><strong>public boolean delete(Object old)</strong><span> this method deletes the object being passed to the method from the tree.&nbsp; When you remove the node you must then change any children around to accommodate for the deleted node.&nbsp; Return true if the node was successfully deleted, false if it was not in the tree and therefore not deleted.</span></li>
            <li aria-level="3"><strong>public void printInOrder()</strong><span> prints the tree using an In Order traversal - recursion</span></li>
            <li aria-level="3"><strong>public void printPreOrder()</strong><span> prints the tree using a Pre Order traversal - recursion</span></li>
            <li aria-level="3"><strong>public void printPostOrder()</strong><span> prints the tree using a Post Order traversal &ndash; recursion<br /><em><strong>(6 points with proper helper method creation, use of recursion - for all 3 traversals)</strong></em><br /></span></li>
        </ol>
    </li>
    <ol>
        <li aria-level="2"><span>Make sure to name variables and methods as directed.&nbsp; The methods should have appropriate modifiers, return types, and parameter numbers/types (from interface).&nbsp;&nbsp;</span></li>
        <li aria-level="2"><span>You can create extra methods/fields as you see them to be useful for your program but they must be private.</span></li>
        <li aria-level="2"><span>Your BST class should include the following methods:&nbsp;</span></li>
    </ol>
</ol>
<p><strong>Remember, the tree must remain sorted to be a legal Binary Search Tree.</strong></p>
<ol>
    <li aria-level="1"><span>Create the following class &ndash; BSTTestFile</span>
        <ol>
            <li aria-level="3"><span>It should create a binary search tree.</span></li>
            <li aria-level="3"><span>The following elements should be added to the BST in the following order: </span><span><br /></span><span>"O", "R", "C", "H", "A", "R", "D", "Q", "U", "I", "N", "C", "E"</span></li>
            <li aria-level="3"><span>The TestFile should then check each of the other 7 methods that were created for the BST class.&nbsp; The program should output and label the results of at least one call for each method.&nbsp; If there is no return value, the output should show what has occurred within the structure.</span></li>
        </ol>
    </li>
    <ol>
        <li aria-level="2"><span>Make sure to name variables and methods appropriately.&nbsp; The methods should have appropriate modifiers, return types, and parameter numbers/types &ndash; if you create any.&nbsp;&nbsp;</span></li>
        <li aria-level="2"><span>Your BSTTestFile class should include/perform the following:</span></li>
    </ol>
    <li aria-level="1"><span>Test and debug your program &ndash; make sure to test for any/all possible cases (base case, first case, average case, last case).</span></li>
</ol>
<p><strong>REMINDERS:</strong></p>
<ul>
    <li aria-level="1"><span>Make sure to include an appropriate header for ALL files.</span></li>
    <li aria-level="1"><span>Make sure to follow the commenting procedures including pre and post conditions, comments at the end of blocks of code.</span></li>
    <li aria-level="1"><span>Make sure to use appropriate naming conventions for all variables and methods.</span></li>
</ul>