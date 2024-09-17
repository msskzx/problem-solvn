"""
https://leetcode.com/problems/relative-ranks/
"""

class Solution:
    def findRelativeRanks(self, score: List[int]) -> List[str]:
        a = sorted(score, reverse=True)
        ranks = {x: i+1 for i, x in enumerate(a)}
        res = []
        
        for x in score:
            rank = ranks[x]
            if rank == 1:
                res.append('Gold Medal')
            elif rank == 2:
                res.append('Silver Medal')
            elif rank == 3:
                res.append('Bronze Medal')
            else:
                res.append(str(rank))

        return res
        