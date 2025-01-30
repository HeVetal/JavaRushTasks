SELECT YEAR(date_time) AS year,
       MONTH(date_time) AS month,
       DAY(date_time) AS day,
       COUNT(*) AS count
FROM event
GROUP BY year, month, day
HAVING count > 5

