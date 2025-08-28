# Write your MySQL query statement below
Update Salary
SET sex= ( Case 
    when sex = 'm'then 'f'
    else 'm' 
    END);