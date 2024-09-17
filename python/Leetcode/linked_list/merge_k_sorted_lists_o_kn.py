# https://leetcode.com/problems/merge-k-sorted-lists/ 

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        prev = ListNode()
        res = prev  
        
        while lists:
            mn = float('inf')
            idx = -1
            for i, li in enumerate(lists):
                if li and li.val < mn:
                    mn = li.val
                    idx = i
            
            if idx == -1:
                break
            
            prev.next = ListNode(lists[idx].val)
            prev = prev.next
            
            lists[idx] = lists[idx].next
            
            if lists[idx] is None:
                del lists[idx]
        
        return res.next
