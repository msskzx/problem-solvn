# https://leetcode.com/problems/duplicate-emails/submissions/1251007763/

# Write your MySQL query statement below
SELECT email
FROM Person
GROUP BY email
HAVING count(email) > 1