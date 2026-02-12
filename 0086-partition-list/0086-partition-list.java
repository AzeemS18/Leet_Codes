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
    public ListNode partition(ListNode head, int x) {
        ListNode sd = new ListNode(0);
        ListNode bd = new ListNode(0);
        ListNode s = sd;
        ListNode b = bd;

        while( head != null){
            if(head.val < x){
                s.next = head;
                s = s.next;
            }else{
                b.next = head;
                b = b.next;
            }
            head = head.next;
        }
        b.next = null;
        s.next = bd.next;
        return sd.next;

        
    }
}