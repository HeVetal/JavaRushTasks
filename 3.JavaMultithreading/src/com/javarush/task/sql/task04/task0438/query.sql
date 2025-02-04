# SELECT IF(position LIKE '%developer%', 'software developer', position)
# FROM employee
SELECT REPLACE(position, 'developer', 'software developer')
FROM employee