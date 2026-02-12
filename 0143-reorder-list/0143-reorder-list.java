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
    public void reorderList(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        while( f != null && f.next != null ){
            s = s.next;
            f = f.next.next;
        }
        ListNode ms = s.next; // middle start
        s.next = null; // middle end
        ListNode prev = null;
        ListNode curr = ms;
        while(curr != null){
            ListNode t = curr.next;
            curr.next = prev;
            prev = curr;
            curr = t;
        }
        ListNode fi = head;//final
        ListNode se = prev;
        while( se != null ){
            ListNode t1 = fi.next;
            ListNode t2 = se.next;

            fi.next = se;
            se.next = t1;
            fi = t1;
            se = t2;
        }

        

        
    }
}