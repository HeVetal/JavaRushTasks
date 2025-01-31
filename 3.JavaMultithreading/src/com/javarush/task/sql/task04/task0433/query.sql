SELECT YEAR(date) year,
       MONTH(date) month,
       DAY(date) day,
       COUNT(*)
FROM event
WHERE user_id = 3 AND type = 'SOLVE_TASK' AND status = 'OK'
GROUP BY year, month, day