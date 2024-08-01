"""
https://leetcode.com/problems/non-overlapping-intervals/
"""

class Solution:
    def eraseOverlapIntervals(self, intervals: List[List[int]]) -> int:
        intervals.sort()
        prev_end = intervals[0][1]
        c = 0
        for start, end in intervals[1:]:
            if start >= prev_end:
                prev_end = end
            else:
                c += 1
                prev_end = min(prev_end, end)
        return c