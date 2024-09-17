"""
https://leetcode.com/problems/swap-nodes-in-pairs/
"""

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def swapPairs(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = ListNode(0, head)

        def swp(head, prev):
            if not head or not head.next:
                return
            three = head.next.next
            head, head.next = head.next, head
            head.next.next = three
            prev.next = head
            swp(three, head.next)
        
        swp(head, prev)
        return prev.next
            