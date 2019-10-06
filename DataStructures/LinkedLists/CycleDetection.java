/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    Node fast = head;
    
    while(fast != null && fast.next != null) {
        fast = fast.next.next;
        head = head.next;
        
        if(head.equals(fast)) {
            return true;
        }
    }
    return false;
}
