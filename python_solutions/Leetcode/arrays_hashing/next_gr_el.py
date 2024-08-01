"""
https://leetcode.com/problems/next-greater-element-i/
"""

class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        nxt = dict()
        nxt[nums2[-1]] = -1
        for i in range(len(nums2) - 2, -1, -1):
            mx = -1
            for x in nums2[i:]:
                if x > nums2[i]:
                    mx = x
                    break
            nxt[nums2[i]] = mx 
        res = []
        for x in nums1:
            res.append(nxt[x])
        return res
        