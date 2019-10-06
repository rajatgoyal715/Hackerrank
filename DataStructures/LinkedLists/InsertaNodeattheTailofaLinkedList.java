/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
    Node temp = new Node();
    Node ptr = new Node();
    temp = head;
    ptr.data = data;
    ptr.next = null;
    if(head==null){
        head = ptr;
    }
    else{    
    while(temp.next!=null)
        temp = temp.next;
    temp.next = ptr;
    }
    return head;
}
