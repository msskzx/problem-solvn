"""
https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/submissions/1251831077/
"""

class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        pr = 1
        sm = 0

        while n > 0:
            d = n % 10
            n //= 10
            pr *= d
            sm += d

        return pr - sm 