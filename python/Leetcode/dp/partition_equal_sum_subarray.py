"""
https://leetcode.com/problems/partition-equal-subset-sum/submissions/1259383342/
"""

class Solution:
    def canPartition(self, nums: List[int]) -> bool:
        sm = sum(nums)
        if sm % 2 != 0:
            return False
        dp = set([0])
        target = sm // 2
        for x in nums:
            tmp = dp.copy()
            for y in tmp:
                dp.add(y+x)
            if target in dp:
                return True
        
        return target in dp