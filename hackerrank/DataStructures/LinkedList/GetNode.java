int GetNode(Node head,int n) {
    Node result = head;
    Node curr = head;
    int index = 0;
    while(curr.next != null) {
        curr=curr.next;
        index++;
        if(index > n) {
            result = result.next;
        }
    }
    return result.data;
}