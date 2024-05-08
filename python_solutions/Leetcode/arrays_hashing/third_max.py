"""
https://leetcode.com/problems/third-maximum-number/
"""

class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        if len(nums) < 3:
            return max(nums)

        mx1 = mx2 = mx3 = -2**31 - 1
        for x in nums:
            if x > mx1:
                mx1, mx2, mx3 = x, mx1, mx2
            if mx2 < x < mx1:
                mx2, mx3 = x, mx2
            if mx3 < x < mx2:
                print('hi')
                mx3 = x
        
        return mx1 if mx3 == -2**31-1 else mx3
        