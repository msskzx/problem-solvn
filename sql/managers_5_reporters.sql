# https://leetcode.com/problems/managers-with-at-least-5-direct-reports/submissions/1251015114/

# Write your MySQL query statement below
SELECT m.name
FROM Employee e
JOIN Employee m
ON e.managerId = m.id
GROUP BY e.managerId
HAVING count(*) > 4