"""
https://leetcode.com/problems/top-k-frequent-elements/description/
"""

class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        c = 1
        freq = {}
        a = []
        # count freq
        for x in nums:
            if x in freq:
                freq[x] += 1
            else:
                freq[x] = 1
        
        for key, val in freq.items():
            a.append([int(key), val])

        # sort
        # [[val, freq], [val, freq]]
        l = 0
        r = len(a) - 1
        self.quicksort(a, l, r)

        res = []
        for i in range(k):
            res.append(a[i][0])

        print(a)
        return res
    
    def quicksort(self, a, l, r):
        if l < r:
            pivot_idx = self.partition(a, l, r)
            self.quicksort(a, l, pivot_idx-1)
            self.quicksort(a, pivot_idx+1, r)

    def partition(self, a, l, r):
        pivot = a[r][1]
        pivot_idx = l - 1

        for i in range(l, r):
            if a[i][1] > pivot:
                pivot_idx += 1
                a[i], a[pivot_idx] = a[pivot_idx], a[i]
        
        pivot_idx += 1
        a[pivot_idx], a[r] = a[r], a[pivot_idx]
        return pivot_idx