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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode d = new ListNode(0);
        d.next = head;
        ListNode gp = d;
        while(true){
            ListNode kth = gp;

            for(int i = 0 ; i < k && kth != null ; i++){
                kth = kth.next;
            }
            if(kth == null)break;
            ListNode gn = kth.next; // 3
            ListNode p = gn; //3
            ListNode c = gp.next; // 1
            while( c != gn ){
                ListNode t = c.next;
                c.next = p;
                p = c;
                c = t;
            } //  2 - 1

            ListNode t = gp.next; // 3
            gp.next = kth; // 2 - 1 - 3
            gp = t; // now gp point at 3
        }

        return d.next;
        
    }
}