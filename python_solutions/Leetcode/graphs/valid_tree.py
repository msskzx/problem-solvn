# https://neetcode.io/problems/valid-tree

class Solution:
    def validTree(self, n: int, edges: List[List[int]]) -> bool:
        if len(edges) != n - 1:
            return False
        visited = set()
        g = {x: [] for x in range(n)}
        for x, y in edges:
            g[x].append(y)
            g[y].append(x)

        def dfs(x, prev):
            if x in visited:
                return False
            
            visited.add(x)
            for y in g[x]:
                if y == prev:
                    continue
                if not dfs(y, x):
                    return False
            return True
            
        return dfs(0, -1) and len(visited) == n