"""
https://leetcode.com/problems/remove-nth-node-from-end-of-list/
"""

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        c = 1
        scout = head
        while c < n:
            c += 1
            scout = scout.next
        
        cur = head
        prev = None
        while scout.next:
            scout = scout.next
            prev = cur
            cur = cur.next
        
        if cur == head:
            head = head.next
        else:
            prev.next = cur.next
        return head
        