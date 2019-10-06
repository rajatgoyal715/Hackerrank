/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

void inOrder(Node root) {
if(root==null){
        return;
    }
    inOrder(root.left);
    System.out.print(root.data+" ");
    inOrder(root.right);
}
