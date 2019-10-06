/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/
void postOrder(Node root) {
    if(root==null){
        return;
    }
    postOrder(root.left);
    postOrder(root.right);
    System.out.print(root.data+" ");
}
