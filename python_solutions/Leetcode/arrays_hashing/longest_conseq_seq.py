"""
https://leetcode.com/problems/longest-consecutive-sequence/
"""

class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        a = set(nums)
        cur = 0
        mx = 0

        for x in a:
            if x-1 not in a:
                cur = 1
                e = x+1
                while e in a:
                    cur += 1
                    e += 1
                mx = max(mx, cur)
        
        return mx

            