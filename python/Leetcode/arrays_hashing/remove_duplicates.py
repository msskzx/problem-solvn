"""
https://leetcode.com/problems/remove-duplicates-from-sorted-array/
"""

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i = j = k = 0

        while i < len(nums) and j < len(nums):
            while j < len(nums) and nums[i] == nums[j]:
                j += 1
            nums[k] = nums[i]
            i = j
            k += 1
        
        return k