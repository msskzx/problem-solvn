# https://leetcode.com/problems/the-number-of-beautiful-subsets/

class Solution:
    def beautifulSubsets(self, nums: List[int], k: int) -> int:
        freq = defaultdict(int)

        def dfs(i):
            if i == len(nums):
                return 1

            res = 0
            if not freq[nums[i] + k] and not freq[nums[i] - k]:
                freq[nums[i]] += 1
                res += dfs(i + 1)
                freq[nums[i]] -= 1
            
            res += dfs(i + 1)

            return res
        
        return dfs(0) - 1
