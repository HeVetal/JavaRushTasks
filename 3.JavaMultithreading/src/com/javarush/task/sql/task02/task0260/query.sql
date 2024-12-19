SELECT rating,
       GROUP_CONCAT(name)
FROM employee
GROUP BY rating
HAVING rating > 2
