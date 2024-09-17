"""
https://leetcode.com/problems/house-robber/
"""

class Solution:
    def rob(self, nums: List[int]) -> int:
        a = 0
        b = 0
        
        for x in nums:
            cur = max(x+a, b)
            a = b
            b = cur
        
        return b
        