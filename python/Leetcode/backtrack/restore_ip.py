# https://leetcode.com/problems/restore-ip-addresses/

class Solution:
    def restoreIpAddresses(self, s: str) -> List[str]:
        if len(s) > 12:
            return []
        res = []
        def dfs(i, cur, k):
            if i == len(s) and k == 0:
                res.append(cur[:-1])
                return
            if k < 0:
                return
            
            for j in range(i, min(len(s), i + 3)):
                if int(s[i:j+1]) <= 255 and (i == j or s[i] != '0'):
                    dfs(j + 1, cur + s[i:j+1] + ".", k-1)
            
        dfs(0, "", 4)
        return res
        
