"""
Dutch National Flag problem

https://leetcode.com/problems/sort-colors/submissions/1251675847/
"""

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        zero = one = 0
        two = len(nums) - 1
        while one <= two:
            if nums[one] == 0:
                nums[one], nums[zero] = nums[zero], nums[one]
                zero += 1
                one += 1
            elif nums[one] == 1:
                one += 1
            else:
                nums[two], nums[one] = nums[one], nums[two]
                two -= 1
        return nums