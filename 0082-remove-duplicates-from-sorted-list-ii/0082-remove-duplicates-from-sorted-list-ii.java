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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode d = new ListNode(0);
        d.next = head;

        ListNode p = d;
        ListNode c = head;

        while(c != null){
            if(c.next != null && c.val == c.next.val ){
                int dup = c.val;
                while( c != null && c.val == dup){
                    c = c.next;
                }
                p.next = c;
            }else{
                p = c;
                c = c.next;
            }
        }
        return d.next;
        
    }
}