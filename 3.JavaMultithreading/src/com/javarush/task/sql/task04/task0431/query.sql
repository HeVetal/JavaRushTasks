SELECT DAYNAME(date) day,
       COUNT(*) counts
FROM event
WHERE type = 'REGISTRATION'
GROUP BY day
ORDER BY counts DESC
LIMIT 1