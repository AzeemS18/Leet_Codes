# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reorderList(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: None Do not return anything, modify head in-place instead.
        """
        slow,fast=head,head
        while fast and fast.next:
            slow=slow.next
            fast=fast.next.next
        prev=None
        current=slow.next
        slow.next = None
        while current:
            new_node = current.next
            current.next=prev
            prev=current
            current=new_node
        first,second =head,prev
        while second:
            t1,t2=first.next,second.next
            first.next = second
            second.next = t1
            first,second = t1,t2