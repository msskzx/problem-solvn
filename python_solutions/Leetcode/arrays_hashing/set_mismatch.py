"""
https://leetcode.com/problems/set-mismatch/
"""

class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        for x in nums:
            if nums[abs(x) - 1] < 0:
                dup = abs(x)
            nums[abs(x) - 1] = -abs(nums[abs(x) - 1])
        
        for i, x in enumerate(nums):
            if x > 0:
                mis = i + 1
        
        return [dup, mis]
