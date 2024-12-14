SELECT name,
       YEAR(date_of_birth)  AS year,
       MONTH(date_of_birth) AS month
FROM employee
# WHERE MONTH(date_of_birth) < 3
#    OR MONTH(date_of_birth) > 11

WHERE MONTH(date_of_birth) IN(1,2,12)