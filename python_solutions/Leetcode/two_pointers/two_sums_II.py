"""
https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
"""

class Solution(object):
    def twoSum(self, numbers, target):
        """
        :type numbers: List[int]
        :type target: int
        :rtype: List[int]
        """
        l = 0
        r = len(numbers) - 1

        while l < r:
            cur = numbers[l] + numbers[r]
            if cur == target:
                return [l+1, r+1]
            if cur < target:
                l += 1
            else:
                r -= 1
        
        return -1

class SolutionTwo(object):
    def twoSum(self, numbers, target):
        """
        :type numbers: List[int]
        :type target: int
        :rtype: List[int]
        """
        for i, x in enumerate(numbers):
            y = target - x
            j = self.bs(y, numbers, i)
            if j != -1:
                return sorted([i+1, j+1])

    def bs(self, y, numbers, i):
        l = 0
        r = len(numbers) - 1
        
        while l <= r:
            mid = (l + r)/2
            if numbers[mid] == y and mid != i:
                return mid
            if numbers[mid] < y:
                l = mid + 1
            else:
                r = mid - 1
        
        return -1