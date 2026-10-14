# Write your MySQL query statement below
SELECT user_id, email FROM Users WHERE REGEXP_LIKE (email, '^[a-z0-9]+@[a-z]+\[.]com$')
ORDER BY user_id ASC;