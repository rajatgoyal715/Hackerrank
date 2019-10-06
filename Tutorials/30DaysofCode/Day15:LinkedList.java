	public static  Node insert(Node head,int data)
	{
        Node node = new Node(data);
        if(head==null)
            return node;
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        return head;
	}