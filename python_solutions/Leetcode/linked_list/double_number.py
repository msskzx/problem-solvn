"""
https://leetcode.com/problems/double-a-number-represented-as-a-linked-list/
"""

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def doubleIt(self, head: Optional[ListNode]) -> Optional[ListNode]:
        stack = []
        cur = head
        while cur:
            stack.append(cur)
            cur = cur.next
        
        carry = 0
        while stack:
            cur = stack.pop()
            d = cur.val * 2 + carry
            cur.val = d % 10
            carry = d // 10
        
        return ListNode(carry, head) if carry else head