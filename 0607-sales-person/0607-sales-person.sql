# Write your MySQL query statement below
SELECT s.name 
FROM SalesPerson s
where s.sales_id NOT IN (
    select o.sales_id from
    Orders o
    JOIN Company c on c.com_id = o.com_id
    where c.name = "RED"
)