Node Reverse(Node head) {
    if(head == null || head.next == null) {
        return head;
    }
    
    Node remainder = Reverse(head.next);
    head.next.next = head;
    head.next = null;
    return remainder;
}