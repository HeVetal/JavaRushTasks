SELECT YEAR(date_of_birth) AS year,
       MONTH(date_of_birth) AS month,
       COUNT(*)
FROM employee
GROUP BY year, month