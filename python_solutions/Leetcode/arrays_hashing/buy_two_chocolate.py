"""
https://leetcode.com/problems/buy-two-chocolates/
"""

class Solution:
    def buyChoco(self, prices: List[int], money: int) -> int:
        # O(n)
        min1 = 0
        min2 = 1
        for i in range(1, len(prices)):
            if prices[i] <= prices[min1]:
                min1, min2 = i, min1
            if prices[i] <= prices[min2] and i != min1:
                min2 = i
        
        choco = prices[min1] + prices[min2]
        return money if choco > money else money - choco
        