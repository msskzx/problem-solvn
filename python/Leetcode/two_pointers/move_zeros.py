"""
https://leetcode.com/problems/move-zeroes/description/
"""

class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        i = 0
        for j in range(len(nums)):
            if nums[j] == 0:
                if nums[i] != 0:
                    i = j
            else:
                if nums[i] == 0:
                    nums[i], nums[j] = nums[j], nums[i]
                    i += 1
        