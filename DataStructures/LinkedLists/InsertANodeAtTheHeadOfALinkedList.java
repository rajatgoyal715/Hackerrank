// Complete the insertNodeAtHead function below.

/*
    * For your reference:
    *
    * SinglyLinkedListNode {
    *     int data;
    *     SinglyLinkedListNode next;
    * }
    *
    */
static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
    SinglyLinkedListNode ptr = new SinglyLinkedListNode();
    ptr.data = x;
    ptr.next = null;
    if(head == null)
        head = ptr;
    else {
        ptr.next = head;
        head = ptr;
    }
    return head;
}