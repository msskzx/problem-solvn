"""
https://leetcode.com/problems/distribute-candies/
"""

class Solution:
    def distributeCandies(self, candyType: List[int]) -> int:
        t = set(candyType)
        return min(len(t), len(candyType)//2)