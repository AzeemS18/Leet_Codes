/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode d = new ListNode(0);
        d.next = head;
        ListNode c = head;
        int count = 0;
        while( c != null){
            c = c.next;
            count++;
        }
        int rem = count - n;
        c = d;
        for(int i = 0 ; i < rem ; i++){
            c = c.next;
        }
        c.next = c.next.next;
        return d.next;
        
    }
}