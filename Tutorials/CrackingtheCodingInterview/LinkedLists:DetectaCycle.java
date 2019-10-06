/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    Node slow_p = head, fast_p = head;
    while(slow_p!= null && fast_p!= null && fast_p.next!=null) {
        slow_p = slow_p.next;
        fast_p = fast_p.next.next;
        if(slow_p == fast_p){
            return true;
        }
    }
    return false;
}
