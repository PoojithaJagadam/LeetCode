# Write your MySQL query statement below
Select name as Customers
from Customers c
left join  Orders o on
 o.customerId = c.id 
 where o.customerId is NULL;