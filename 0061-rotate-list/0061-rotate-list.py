# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def rotateRight(self, head, k):
        """
        :type head: Optional[ListNode]
        :type k: int
        :rtype: Optional[ListNode]
        """
        if not head or not head.next or k == 0:
            return head
        l = 1
        tail = head
        while tail.next:
            tail = tail.next
            l +=1
        
        tail.next = head

        sn_t = ( l - k % l - 1)
        n_t = head
        for _ in range(sn_t):
            n_t = n_t.next
        n_h = n_t.next

        n_t.next = None

        return n_h
        
        