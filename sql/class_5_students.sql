# https://leetcode.com/problems/classes-more-than-5-students/

# Write your MySQL query statement below
SELECT class
FROM courses
Group by class
HAVING count(*) >= 5