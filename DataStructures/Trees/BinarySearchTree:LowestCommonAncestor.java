

 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

    static Node lca(Node root,int v1,int v2)
    {
        Node temp = root;
        while(temp!=null){
            if(temp.data == v1 || temp.data == v2 || (temp.data > v1 && temp.data < v2) || (temp.data > v2 && temp.data < v1)) return temp;
            else if(temp.data > v1 && temp.data > v2) temp = temp.left;
            else temp = temp.right;
        }
        return temp;
    }




