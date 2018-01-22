int CompareLists(Node headA, Node headB) {
    if(headA == null && headB == null) {
        return 1;
    }
    else if (headA == null || headB == null) {
        return 0;
    } 
    
    if(headA.data != headB.data) {
        return 0;
    } else {
        return CompareLists(headA.next, headB.next);
    }
}