# https://leetcode.com/problems/combination-sum-ii/

class Solution:
    def combinationSum2(self, a: List[int], target: int) -> List[List[int]]:
        res = []
        a.sort()

        def dfs(i, subset, cur):
            if cur == target:
                res.append(subset.copy())
                return
            
            if cur > target or i == len(a):
                return
            
            subset.append(a[i])
            dfs(i + 1, subset, cur + a[i])
            subset.pop()

            while i + 1 < len(a) and a[i] == a[i + 1]:
                i += 1
            
            dfs(i + 1, subset, cur)
        
        dfs(0, [], 0)
        return res
