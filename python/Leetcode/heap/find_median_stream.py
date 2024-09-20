# https://leetcode.com/problems/find-median-from-data-stream

class MedianFinder:

    def __init__(self):
        self.left = []
        self.right = []


    def addNum(self, num: int) -> None:
        heapq.heappush(self.left, -1 * num)

        if (self.right and -1 * self.left[0] > self.right[0]) or len(self.left) > len(self.right) + 1:
            x = -1 * heapq.heappop(self.left)
            heapq.heappush(self.right, x)
        
        if len(self.left) + 1 < len(self.right):
            x = heapq.heappop(self.right)
            heapq.heappush(self.left, -1 * x)
            

    def findMedian(self) -> float:
        if len(self.left) == len(self.right):
            return ((-1 * self.left[0]) + self.right[0]) / 2.0
        
        
        return (-1 * self.left[0]) if len(self.left) > len(self.right) else self.right[0]


# Your MedianFinder object will be instantiated and called as such:
# obj = MedianFinder()
# obj.addNum(num)
# param_2 = obj.findMedian()
