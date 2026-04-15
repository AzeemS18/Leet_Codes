# Write your MySQL query statement below
SELECT DISTINCT num AS ConsecutiveNums
FROM(
    SELECT Num,
           LAG(num , 1) OVER (ORDER BY id) as p1,
           LAG(num , 2) OVER (ORDER BY id) as p2
    FROM Logs

)t
WHERE Num = p1 AND p1 = p2; 



