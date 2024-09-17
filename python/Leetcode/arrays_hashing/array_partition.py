"""
https://leetcode.com/problems/array-partition/
"""

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        i = 1
        sm = 0
        while i < len(nums):
            sm += min(nums[i], nums[i-1])
            i += 2
        
        return sm
        