class MyLinkedList {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    ListNode dummy;
    int size;

    public MyLinkedList() {
        dummy = new ListNode(0);
        size = 0 ;   
    }
    
    public int get(int index) {
        if ( index < 0 || index >= size) return -1;
        ListNode c = dummy.next;
        for(int i = 0 ; i < index ; i++){
            c = c.next;
        }
        return c.val;
    }
    
    public void addAtHead(int val) {
        ListNode temp = new ListNode(val);
        temp.next = dummy.next;
        dummy.next = temp;
        size++;  
    }
    
    public void addAtTail(int val) {
        ListNode c = dummy;
        while( c.next != null){
            c = c.next;
        }
        c.next = new ListNode(val);
        size++;
        
    }
    
    public void addAtIndex(int index, int val) {
        if ( index > size ) return;
        if ( index < 0 ) index = 0;
        ListNode c = dummy;
        for(int i = 0 ; i < index ; i++){
            c = c.next;
        }
        ListNode t = new ListNode(val);
        t.next = c.next;
        c.next = t;
        size++;

        
    }
    
    public void deleteAtIndex(int index) {
        if ( index < 0 || index >= size ) return ;
        ListNode c = dummy;
        for(int i = 0 ; i < index ; i++){
            c = c.next;
        }
        c.next = c.next.next;
        size--;
        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */