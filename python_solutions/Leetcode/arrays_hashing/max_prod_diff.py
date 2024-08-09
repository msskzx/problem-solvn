# https://leetcode.com/problems/maximum-product-difference-between-two-pairs/ 

class Solution:
    def maxProductDifference(self, nums: List[int]) -> int:
        max1 = max2 = 0
        min1 = min2 = float('inf')
        for x in nums:
            if x > max2:
                if x > max1:
                    max2, max1 = max1, x
                else:
                    max2 = x
            if x < min2:
                if x < min1:
                    min2, min1 = min1, x
                else:
                    min2 = x
        
        return max1 * max2 - min1 * min2