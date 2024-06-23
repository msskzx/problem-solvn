# https://leetcode.com/problems/big-countries/submissions/1282674088/
# Write your MySQL query statement below

SELECT name, population, area
FROM world
WHERE area >= 3000000
OR population >= 25000000;