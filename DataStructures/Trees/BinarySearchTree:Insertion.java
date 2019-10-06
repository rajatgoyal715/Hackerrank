 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node Insert(Node root,int value)
{
    if(root==null){
        Node temp=new Node();
        temp.data=value;
        temp.left=null;
        temp.right=null;
        return temp;
    }
    if(root.data>value){
        if(root.left==null){
            Node temp=new Node();
            temp.data=value;
            temp.left=null;
            temp.right=null;
            root.left=temp;
            return root;
        }
        root.left=Insert(root.left,value);
    }else{
        if(root.right==null){
            Node temp=new Node();
            temp.data=value;
            temp.left=null;
            temp.right=null;
            root.right=temp;
            return root;
        }
        root.right=Insert(root.right,value);
    }
    return root;
}


