"""
https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative
"""

class Solution:
    def findMaxK(self, nums: List[int]) -> int:
        n = 1000
        dist = [0] * (2*n+1)
        for x in nums:
            dist[x + n] = 1
        for i in range(n):
            if dist[i] and dist[2*n-i]:
                return n - i
        return -1
        