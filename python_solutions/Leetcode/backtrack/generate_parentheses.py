"""
https://leetcode.com/problems/generate-parentheses/
"""

class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        res = []

        def dfs(s, opened, closed):
            if opened == closed == n:
                res.append(s)
                return
            
            if opened < n:
                dfs(s + "(", opened+1, closed)
            
            if closed < opened:
                dfs(s + ")", opened, closed+1)
            

        dfs("", 0, 0)
        return res