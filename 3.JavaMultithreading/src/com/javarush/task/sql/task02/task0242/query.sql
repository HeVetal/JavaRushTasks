SELECT YEAR(date_of_birth),
       MONTH(date_of_birth),
       COUNT(*)
FROM employee
GROUP BY YEAR(date_of_birth), MONTH(date_of_birth)
# ORDER BY YEAR(date_of_birth)
