"""
https://leetcode.com/problems/find-the-distance-value-between-two-arrays/description/
"""

class Solution:
    def findTheDistanceValue(self, arr1: List[int], arr2: List[int], d: int) -> int:
        c = 0
        for i in range(len(arr1)):
            flag = True
            for j in range(len(arr2)):
                if abs(arr1[i] - arr2[j]) <= d:
                    flag = False
                    break
            
            c += 1 if flag else 0
        
        return c
        