"""
https://leetcode.com/problems/add-binary/submissions/1244415796/
"""

class Solution:
    def addBinary(self, a: str, b: str) -> str:
        return bin(int(a, 2) + int(b, 2))[2:]