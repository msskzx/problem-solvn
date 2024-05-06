"""
https://leetcode.com/problems/richest-customer-wealth/
"""

class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        mx = 0
        for customer in accounts:
            cur = sum(customer)
            mx = max(cur,mx)
        return mx