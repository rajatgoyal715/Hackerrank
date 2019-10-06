/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node MergeLists(Node headA, Node headB) {
    if(headA==null)
        return headB;
    if(headB==null)
        return headA;
    if(headA.data<headB.data){
        headA.next = MergeLists(headA.next,headB);
        return headA;
    }
    else{
        headB.next = MergeLists(headA,headB.next);
        return headB;
    }
}
