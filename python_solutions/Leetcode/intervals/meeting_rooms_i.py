"""
https://neetcode.io/problems/meeting-schedule
"""

"""
Definition of Interval:
class Interval(object):
    def __init__(self, start, end):
        self.start = start
        self.end = end
"""

class Solution:
    def canAttendMeetings(self, intervals: List[Interval]) -> bool:
        a = intervals
        a.sort(key=lambda x: x.start)
        for i in range(1, len(a)):
            if a[i].start < a[i-1].end:
                return False
        return True

