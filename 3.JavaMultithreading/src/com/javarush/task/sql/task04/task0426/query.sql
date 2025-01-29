SELECT YEAR(date) AS year,
       MONTH(date) AS month,
       DAY(date) day,
       SUM(total)
FROM data
GROUP BY year, month, day