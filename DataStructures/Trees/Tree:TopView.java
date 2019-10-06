/*
   class Node 
       int data;
       Node left;
       Node right;
*/
void top_view(Node root)
{
    print_left(root);
    Node temp=root.right;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.right;
    }
}
void print_left(Node root){
    if(root==null)
        return;
    print_left(root.left);
    System.out.print(root.data+" ");
}
