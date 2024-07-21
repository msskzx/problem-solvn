"""
https://leetcode.com/problems/ransom-note/description/
"""
from collections import defaultdict

class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        a = defaultdict(int)
        b = defaultdict(int)
        for x in ransomNote:
            a[x] += 1
        
        for x in magazine:
            b[x] += 1
        
        for k, v in a.items():
            if not(k in b and v <= b[k]):
                return False
        return True