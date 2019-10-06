/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node SortedInsert(Node head, int data) {
    Node newNode = new Node();
    newNode.data = data;
    if(head == null) return newNode;
    if(head.data > data){
        head.prev = newNode;
        newNode.next = head;
        return newNode;
    }
    Node temp = head;
    while(temp.next!=null && temp.next.data < data){
        temp = temp.next;
    }
    newNode.prev = temp;
    newNode.next = temp.next;
    if(temp.next!=null) temp.next.prev = newNode;
    temp.next = newNode;
    return head;
}
