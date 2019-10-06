/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/

boolean checkBSTUtil(Node root, int max, int min) {
    if(root == null) return true;
    if(root.data < max && root.data > min) return checkBSTUtil(root.left, root.data, min) && checkBSTUtil(root.right, max, root.data);
    return false;
}

boolean checkBST(Node root) {
    return checkBSTUtil(root, 10001, -1);
}