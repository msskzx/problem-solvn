"""
https://leetcode.com/problems/teemo-attacking/
"""

class Solution:
    def findPoisonedDuration(self, timeSeries: List[int], duration: int) -> int:
        if duration == 0:
            return 0

        total = 0
        for i in range(1, len(timeSeries)):
            total += min(duration, timeSeries[i] - timeSeries[i - 1])
        
        return total + duration