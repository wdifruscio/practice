/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
    Node newNode = new Node();
    newNode.data = data;
    Node temp = head;
    if(temp != null) {
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    } else {
        head = newNode;
    }
    return head;
}


