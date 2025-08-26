# Write your MySQL query statement below
SELECT max(salary) as SecondHighestSalary
FROM Employee
where salary < (
    Select max(salary)
    from Employee
) 


 

 

