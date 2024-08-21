# https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/

class Solution:
    def countStudents(self, students: List[int], sandwiches: List[int]) -> int:
        freq = Counter(students)
        c = len(students)
        for x in sandwiches:
            if freq[x] == 0:
                break
            freq[x] -= 1
            c -= 1
        return c