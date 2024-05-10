"""
https://leetcode.com/problems/max-consecutive-ones/
"""

class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        mx = nums[0]
        cur = nums[0]

        for i in range(1, len(nums)):
            if nums[i] + nums[i-1] == 2:
                cur += 1
            else:
                cur = nums[i]
            mx = max(mx, cur)
        
        return mx