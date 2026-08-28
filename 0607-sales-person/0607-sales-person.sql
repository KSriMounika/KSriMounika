/* Write your PL/SQL query statement below */
SELECT S.name
FROM
SalesPerson S
WHERE S.sales_id NOT IN 
(
SELECT O.sales_id
FROM
Orders O
JOIN
Company C
ON C.com_id = O.com_id
WHERE C.name = 'RED';
);
