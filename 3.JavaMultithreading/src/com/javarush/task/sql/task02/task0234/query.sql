SELECT YEAR(date_of_birth) AS year_of_birth,
       COUNT(*)
FROM employee
GROUP BY year_of_birth