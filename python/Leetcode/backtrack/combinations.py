# https://leetcode.com/problems/combinations/

class Solution:
    def combine(self, n: int, k: int) -> List[List[int]]:
        res = []
        def dfs(i, a):
            if len(a) == k:
                res.append(a.copy())
                return
            for j in range(i, n + 1):
                a.append(j)
                dfs(j + 1, a)
                a.pop()
        dfs(1, [])
        return res
