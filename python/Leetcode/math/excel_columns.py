"""
https://leetcode.com/problems/excel-sheet-column-title/description/
"""

class Solution:
    def convertToTitle(self, columnNumber: int) -> str:
        s = ""
        while columnNumber:
            columnNumber -= 1
            cur = columnNumber % 26
            columnNumber //= 26
            s = chr(ord('A') + cur) + s
        return s