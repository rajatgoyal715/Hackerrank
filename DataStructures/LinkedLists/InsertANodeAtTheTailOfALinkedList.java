// Complete the insertNodeAtTail function below.

/*
* For your reference:
*
* SinglyLinkedListNode {
*     int data;
*     SinglyLinkedListNode next;
* }
*
*/
static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
    SinglyLinkedListNode temp = new SinglyLinkedListNode();
    SinglyLinkedListNode ptr = new SinglyLinkedListNode();
    temp = head;
    ptr.data = data;
    ptr.next = null;
    if(head == null){
        head = ptr;
    }
    else{    
    while(temp.next != null)
        temp = temp.next;
    temp.next = ptr;
    }
    return head;
}