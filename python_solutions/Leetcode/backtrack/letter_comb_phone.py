# https://leetcode.com/problems/letter-combinations-of-a-phone-number/

class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        a = ['', '', 'abc', 'def', 'ghi', 'jkl', 'mno', 'pqrs', 'tuv', 'wxyz']
        res = []
        cur = ''
        def dfs(i, cur):
            if i == len(digits):
                res.append(cur)
                return
            for c in a[int(digits[i])]:
                dfs(i + 1, cur + c)
            
        if digits:
            dfs(0, '')
        return res