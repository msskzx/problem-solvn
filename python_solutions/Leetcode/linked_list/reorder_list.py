"""
https://leetcode.com/problems/reorder-list/
"""

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        """
        Do not return anything, modify head in-place instead.
        """
        # point to second half
        slow = fast = head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
        
        # set mid to point to None
        cur = slow.next
        slow.next = None
        prev = None
        # reverse second half
        while cur:
            cur.next, prev, cur = prev, cur, cur.next
        
        # merge
        start = head
        end = prev
        print(start)
        while end:
            start.next, end.next, start, end = end, start.next, start.next, end.next