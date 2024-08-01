"""
https://leetcode.com/problems/find-smallest-letter-greater-than-target/
"""

class Solution:
    def nextGreatestLetter(self, letters: List[str], target: str) -> str:
        for i in range(1, 25):
            c = chr(ord(target) + i)
            lw = 0
            hi = len(letters) - 1
            while lw <= hi:
                mid = (lw + hi) // 2
                if letters[mid] == c:
                    return c
                if letters[mid] < c:
                    lw = mid + 1
                else:
                    hi = mid - 1
        return letters[0]
        