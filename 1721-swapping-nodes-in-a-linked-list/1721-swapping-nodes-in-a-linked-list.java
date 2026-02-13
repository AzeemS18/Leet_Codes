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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode d = new ListNode(0);
        d.next = head;
        ListNode kth = head;
        for(int i = 1 ; i < k ; i++){
            kth = kth.next;
        }
        ListNode f = kth;
        ListNode s = head;
        while( f.next != null){
            f = f.next;
            s = s.next;
        }
        int t = kth.val;
        kth.val = s.val;
        s.val = t;

        return d.next;
        
    }
}