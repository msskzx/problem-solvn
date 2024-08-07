"""
https://leetcode.com/problems/time-based-key-value-store/
"""
from collections import defaultdict

class TimeMap:

    def __init__(self):
        self.store = defaultdict(list)
        

    def set(self, key: str, value: str, timestamp: int) -> None:
        self.store[key].append([value, timestamp])
        

    def get(self, key: str, timestamp: int) -> str:
        res = ''
        values = self.store.get(key, [])
        lw, hi = 0, len(values) - 1
        while lw <= hi:
            mid = (lw + hi) // 2
            if values[mid][1] == timestamp:
                return values[mid][0]
            if values[mid][1] < timestamp:
                res = values[mid][0]
                lw = mid + 1
            else:
                hi = mid - 1
        return res
        


# Your TimeMap object will be instantiated and called as such:
# obj = TimeMap()
# obj.set(key,value,timestamp)
# param_2 = obj.get(key,timestamp)