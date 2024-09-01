# https://leetcode.com/problems/find-the-town-judge/

class Solution:
    def findJudge(self, n: int, trust: List[List[int]]) -> int:
        people = set()
        freq = defaultdict(int)
        mx = 0
        jdg = 1
        for x, y in trust:
            people.add(x)
            freq[y] += 1
            if freq[y] > mx:
                jdg = y
                mx = freq[y]
        
        return jdg if len(people) == n - 1 and freq[jdg] == n - 1 else -1
        