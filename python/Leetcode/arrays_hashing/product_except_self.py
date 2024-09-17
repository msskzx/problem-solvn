"""
https://leetcode.com/problems/product-of-array-except-self/
"""

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        pre = [1] * len(nums)
        post = [1] * len(nums)
        
        # pre: product of all elements before cur
        for i in range(1, len(nums)):
            pre[i] = pre[i-1] * nums[i-1]

        for i in range(len(nums)-2, -1, -1):
            post[i] = post[i+1] * nums[i+1]

        return [x * y for x, y in zip(pre, post)]