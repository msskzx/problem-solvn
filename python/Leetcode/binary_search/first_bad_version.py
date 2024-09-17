"""
https://leetcode.com/problems/first-bad-version/
"""

# The isBadVersion API is already defined for you.
# def isBadVersion(version: int) -> bool:

class Solution:
    def firstBadVersion(self, n: int) -> int:
        low = 1
        hi = n
        while low <= hi:
            mid = (low + hi) // 2
            if isBadVersion(mid):
                hi = mid - 1
            else:
                low = mid + 1
        return low