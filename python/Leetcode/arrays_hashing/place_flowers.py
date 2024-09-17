"""
https://leetcode.com/problems/can-place-flowers/
"""

class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        i = 1

        if not sum(flowerbed[0:2]):
            c += 1
            flowerbed[0] = 1
        
        if not sum(flowerbed[-2:]):
            c += 1
            flowerbed[-1] = 1

        while i < len(flowerbed) - 1:
            if not sum(flowerbed[i-1: i+2]):
                flowerbed[i] = 1
                c += 1
            
            if c == n:
                return True
            i += 1
        
        return c >= n
        