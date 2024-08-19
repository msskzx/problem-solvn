# https://leetcode.com/problems/course-schedule-ii/

class Solution:
    def findOrder(self, numCourses: int, pre: List[List[int]]) -> List[int]:
        g = {x: [] for x in range(numCourses)}
        for x, p in pre:
            g[x].append(p)

        visited = set()
        cycle = set()
        res = []
        def dfs(x):
            if x in cycle:
                return False

            if x in visited:
                return True
            
            cycle.add(x)
            for p in g[x]:
                if dfs(p) == False:
                    return False
            cycle.remove(x)
            visited.add(x)
            res.append(x)
            return True
        

        for x in g.keys():
            if dfs(x) == False:
                return []
        return res