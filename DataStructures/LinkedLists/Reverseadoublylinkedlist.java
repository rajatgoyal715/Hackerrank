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

Node Reverse(Node headA) {
    Node headB = new Node();
    headB.data = headA.data;
    headB.next = null;
    Node tempA = headA.next;
    Node tempB;
    while(tempA!=null){
        tempB = new Node();
        tempB.data = tempA.data;
        headB.prev = tempB;
        tempB.next = headB;
        headB = tempB;
        tempA = tempA.next;
    }
    return headB;
}
