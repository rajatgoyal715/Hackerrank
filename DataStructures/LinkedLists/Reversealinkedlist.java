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
Node Reverse(Node head) {
    Node temp = new Node();
    Node prev = new Node();
    Node next = new Node();
    temp = head;
    prev = null;
    while(temp!=null){
        next = temp.next;
        temp.next = prev;
        prev = temp;
        temp = next;
    }
    head = prev;
    return head;
}
