# https://leetcode.com/problems/task-scheduler/

class Solution:
    def leastInterval(self, tasks: List[str], n: int) -> int:
        count = Counter(tasks)
        h = [-x for x in count.values()]
        heapq.heapify(h)
        q = deque()
        time = 0

        while h or q:
            time += 1
            if h:
                c = 1 + heapq.heappop(h)
                if c:
                    q.append([c, time + n])
            if q and q[0][1] == time:
                heapq.heappush(h, q.popleft()[0])
        
        return time
        