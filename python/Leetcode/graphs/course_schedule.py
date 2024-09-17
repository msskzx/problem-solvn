"""
https://leetcode.com/problems/course-schedule/
"""

class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        g = [[] for i in range(numCourses)]
        for a, b in prerequisites:
            g[a].append(b)
        
        visited = [False] * len(g)

        def dfs(adj):
            if visited[adj]:
                return False
            if not g[adj]:
                return True

            visited[adj] = True
            for x in g[adj]:
                if not dfs(x):
                    return False
            visited[adj] = False
            g[adj] = []
            return True

        for x in range(numCourses):
            if not dfs(x):
                return False
        return True