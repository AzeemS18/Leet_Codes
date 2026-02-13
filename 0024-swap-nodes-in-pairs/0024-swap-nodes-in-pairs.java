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
    public ListNode swapPairs(ListNode head) {
        ListNode d = new ListNode(0);
        d.next = head;
        ListNode p = d;
        while( p.next != null && p.next.next != null){
            ListNode f = p.next;
            ListNode s = p.next.next;

            f.next = s.next;
            s.next = f;
            p.next = s;

            p = f;

        }
        return d.next;
        
    }
}