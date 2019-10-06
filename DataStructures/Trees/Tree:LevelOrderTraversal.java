   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void LevelOrder(Node root)
    {
       Queue q = new LinkedList<>();
       q.add(root);
       while(!q.isEmpty()){
           Node t=(Node)q.remove();
           System.out.print(t.data+" ");
           if(t.left!=null)
               q.add(t.left);
           if(t.right!=null)
               q.add(t.right);
       }
    }
