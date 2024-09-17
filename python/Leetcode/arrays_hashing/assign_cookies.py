"""
https://leetcode.com/problems/assign-cookies/
"""

class Solution:
    def findContentChildren(self, g: List[int], s: List[int]) -> int:
        g.sort() 
        s.sort()
        i = count = 0
        for x in g:
            while i < len(s):
                if s[i] >= x:
                    count += 1
                    i += 1
                    break
                i += 1
            
            if i == len(s):
                break
        
        return count
        