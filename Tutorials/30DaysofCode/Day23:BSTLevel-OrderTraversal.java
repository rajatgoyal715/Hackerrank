	
    
    static void levelOrder(Node root){
        LinkedList ll = new LinkedList();
        if(root==null)
            return;
        ll.add(root);
        System.out.print(root.data+" ");
        ll.remove();
        ll.add(root.left);
        ll.add(root.right);
        while(!ll.isEmpty()){
            Node temp=(Node)ll.remove();
            System.out.print(temp.data+" ");
            if(temp.left!=null)
                ll.add(temp.left);
            //System.out.print("added "+temp.left.data);
            if(temp.right!=null)
                ll.add(temp.right);
            //System.out.print("added "+temp.right.data);
        }
    }