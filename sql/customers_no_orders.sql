# https://leetcode.com/problems/customers-who-never-order/submissions/1251745379/

# Write your MySQL query statement below
SELECT c.name AS "Customers"
FROM customers c
WHERE c.id NOT IN
(
    SELECT t.id FROM customers t
    JOIN orders o ON t.id = o.customerId
)