# Write your MySQL query statement below
Select name as Customers 
from Customers c
left join Orders on c.id = Orders.customerId
where Orders.customerId is null;