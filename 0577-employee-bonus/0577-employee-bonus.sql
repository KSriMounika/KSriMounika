# Write your MySQL query statement below
SELECT E.name , B.bonus 
FROM 
Employee e 
LEFT JOIN 
Bonus B 
ON 
e.empId = B.empId
WHERE B.bonus < 1000 OR B.bonus IS NULL;