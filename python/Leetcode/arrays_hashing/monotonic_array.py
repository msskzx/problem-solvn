"""
https://leetcode.com/problems/monotonic-array/
"""

class Solution:
    def isMonotonic(self, nums: List[int]) -> bool:
        dec = False
        for i in range(1, len(nums)):
            if nums[i] < nums[i-1]:
                dec = True
        
        if dec:
            for i in range(1, len(nums)):
                if nums[i] > nums[i-1]:
                    return False
        
        return True
        