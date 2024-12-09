SELECT YEAR(date_of_birth) AS year, COUNT(*)
FROM employee
GROUP BY year