"""
https://leetcode.com/problems/combination-sum/
"""

class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        res = []
        def dfs(cur, a, i):
            if i > len(candidates) - 1 or cur > target:
                return
            
            if cur == target:
                res.append(a.copy())
                return
            
            # take current and more of current
            a.append(candidates[i])
            dfs(cur + candidates[i], a, i)
            a.pop()

            # skip current and go next
            dfs(cur, a, i + 1)
        
        dfs(0, [], 0)

        return res
