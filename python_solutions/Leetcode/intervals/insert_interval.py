"""
https://leetcode.com/problems/insert-interval/
"""

class Solution:
    def insert(self, intervals: List[List[int]], newInterval: List[int]) -> List[List[int]]:
        x, y = newInterval
        # TODO binary search to get start_idx
        res = []
        appended = False
        for a, b in intervals:
            if (a <= x and x <= b
            or a <= y and y <= b):
                # merge
                x = min(a, x)
                y = max(b, y)
            else:
                if not appended and y < b:
                    res.append([x, y])
                    appended = True
                # if in newInterval skip else add
                if b < x or b > y:
                    res.append([a, b])
        
        if not appended:
            res.append([x,y])
        return res                

        