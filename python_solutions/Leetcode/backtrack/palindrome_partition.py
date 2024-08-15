# https://leetcode.com/problems/palindrome-partitioning/

class Solution:
    def partition(self, s: str) -> List[List[str]]:
        res = []
        parts = []

        def dfs(i):
            if i >= len(s):
                res.append(parts.copy())
                return
            
            for j in range(i, len(s)):
                if self.is_pal(s, i, j):
                    parts.append(s[i : j + 1])
                    dfs(j + 1)
                    parts.pop()

        
        dfs(0)
        return res
    
    def is_pal(self, s, i, j):
        while i < j:
            if s[i] != s[j]:
                return False
            i += 1
            j -= 1
        return True
        