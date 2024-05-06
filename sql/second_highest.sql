# https://leetcode.com/problems/second-highest-salary/

SELECT COALESCE(
    (SELECT salary
    FROM Employee
    ORDER BY salary DESC
    LIMIT 1 OFFSET 1
    ),
    NULL
) AS SecondHighestSalary


# or

SELECT COALESCE(
    (SELECT MAX(salary)
    FROM Employee
    WHERE salary < (SELECT MAX(salary) from Employee)
    ),
    NULL
) AS SecondHighestSalary
