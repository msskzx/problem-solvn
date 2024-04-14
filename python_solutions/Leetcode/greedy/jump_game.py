"""
https://leetcode.com/problems/jump-game/submissions/1232151749/
"""

class Solution:
    def canJump(self, nums: List[int]) -> bool:
        mx = 0
        for i, x in enumerate(nums):
            if mx < i:
                return False
            cur = i + x
            mx = max(mx, cur)
        return mx >= len(nums) - 1