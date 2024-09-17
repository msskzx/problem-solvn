"""
https://neetcode.io/problems/meeting-schedule-ii
"""

"""
Definition of Interval:
class Interval(object):
    def __init__(self, start, end):
        self.start = start
        self.end = end
"""

class Solution:
    def minMeetingRooms(self, intervals: List[Interval]) -> int:
        a = []
        for x in intervals:
            a.append([x.start, 1])
            a.append([x.end, 0])
        
        a.sort(key=lambda x: (x[0], x[1]))

        c = 0
        mx = 0
        for x in a:
            if x[1] == 1:
                c += 1
            else:
                c -= 1
            mx = max(mx, c)
        
        return mx
        