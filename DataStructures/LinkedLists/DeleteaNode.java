/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
    Node temp = new Node();
    Node ptr = new Node();
    temp = head;
    if(position==0){
        ptr.data = head.data;
        head = head.next;
        ptr = null;
    }
    else{
        for(int i=0;i<position-1;i++){
            temp = temp.next;
        }
        ptr.data = temp.next.data;
        temp.next = temp.next.next;
        ptr = null;
    }
    return head;
}

