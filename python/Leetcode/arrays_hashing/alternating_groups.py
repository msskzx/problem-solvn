"""
https://leetcode.com/problems/alternating-groups-i/
"""

class Solution:
    def numberOfAlternatingGroups(self, colors: List[int]) -> int:
        c = 0
        for i in range(0, len(colors)):
            if colors[i] != colors[i - 1] and colors[i - 1] == colors[(i + 1) % len(colors)]:
                c += 1
        return c
        