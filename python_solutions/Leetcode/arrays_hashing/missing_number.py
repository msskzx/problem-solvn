"""
https://leetcode.com/problems/missing-number/description/
"""

class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        nums.append(len(nums))
        for x in nums[:-1]:
            nums[x] *= -1
        res = 0
        for i, x in enumerate(nums):
            if x > 0:
                return i
            if x == 0:
                res = i
        
        return res