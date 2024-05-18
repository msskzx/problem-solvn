"""
https://leetcode.com/problems/jump-game-ii/
"""

class Solution:
    def jump(self, nums: List[int]) -> int:
        l = r = res = 0

        while r < len(nums) - 1:
            mx = 0
            for i in range(l, r + 1):
                mx = max(mx, nums[i] + i)

            res += 1
            l = r + 1
            r = mx
        
        return res