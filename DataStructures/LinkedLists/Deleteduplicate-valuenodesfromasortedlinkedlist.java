/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) {
     Node start=head;
        Node second=start.next;
        int temp=start.data;
        while(start!=null){
            second = start.next;
            temp=start.data;
            while(second!=null&&second.data==temp){
                second = second.next;
            }
            start.next = second;
            start = start.next;
        }
        return head;
}
