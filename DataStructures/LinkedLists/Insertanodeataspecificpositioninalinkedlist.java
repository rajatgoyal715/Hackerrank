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

Node InsertNth(Node head, int data, int position) {
    Node temp = new Node();
    Node ptr = new Node();
    temp = head;
    ptr.data = data;
    if(position==0){
        ptr.next = head;
        head = ptr;
    }
    else{
        for(int i=0;i<position-1;i++){
            temp = temp.next;
        }
        ptr.next = temp.next;
        temp.next = ptr;
    }
    return head;
}
