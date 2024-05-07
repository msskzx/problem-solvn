# https://leetcode.com/problems/department-highest-salary/submissions/1250998448/

# Write your MySQL query statement below
SELECT d.Name "Department", e.Name "Employee", e.Salary
FROM Employee e
JOIN Department d
ON e.departmentId = d.id
WHERE 
    e.Salary = (
        SELECT 
            MAX(Salary) 
        FROM 
            Employee 
        WHERE 
            DepartmentId = d.Id
    );