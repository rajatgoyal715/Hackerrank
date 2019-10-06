/*
  Find merge point of two linked lists
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) {
    int m = length(headA);
    int n = length(headB);
    if(m > n) return FindMergeNode(headB, headA);
    int d = n - m;
    Node tempA = headA, tempB = headB;
    for(int i=0;i<d;i++){
        tempB = tempB.next;
    }
    while(tempA!=null && tempB!=null){
        if(tempA.data == tempB.data) return tempA.data;
        tempA = tempA.next;
        tempB = tempB.next;
    }
    return -1;
}

int length(Node head){
    Node temp = head;
    int len = 0;
    while(temp!=null){
        len++;
        temp = temp.next;
    }
    return len;
}
