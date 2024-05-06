# https://leetcode.com/problems/employees-earning-more-than-their-managers/

# Write your MySQL query statement below
SELECT E.NAME AS "Employee"
FROM Employee E
JOIN Employee M
ON E.managerId = M.id
WHERE E.salary > M.salary