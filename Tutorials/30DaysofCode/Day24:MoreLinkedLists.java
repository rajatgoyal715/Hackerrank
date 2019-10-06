    public static Node removeDuplicates(Node head) {
        if(head==null || head.next==null)
            return head;
        ArrayList a=new ArrayList<Integer>();
        Node temp=head;
        a.add(temp.data);
        while(temp.next!=null){
            Node temp2 = temp.next;
            int t=temp2.data;
            if(!a.contains(t)){
                a.add(t);
                temp=temp.next;
            }
            else{
                temp.next = temp.next.next;
            }
        }
        return head;
    }