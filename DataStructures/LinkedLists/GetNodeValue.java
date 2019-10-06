/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
     // This is a "method-only" submission. 
     // You only need to complete this method.
    Node temp = new Node();
    temp = head;
    int t = 1;
    while(temp.next!=null){
        temp = temp.next;
        t++;
    }
    int num = t-n;
    temp = head;
    for(int i=1;i<num;i++){
        temp = temp.next;
    }
    return temp.data;
}
