# Write your MySQL query statement below

#dense_rank() is a ranking function which gives same rank for same scores and continue with next rank
/*select score , DENSE_RANK()
OVER(order by score desc) as 'rank'
from  Scores;*/

SELECT score, DENSE_RANK()
Over(order by score desc) as 'rank'
from Scores

