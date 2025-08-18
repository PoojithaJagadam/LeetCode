# Write your MySQL query statement below
#SELF JOIN
DELETE P1 FROM Person AS P1
Join Person AS P2
ON P1.email = P2.email
where P1.id > P2.id
