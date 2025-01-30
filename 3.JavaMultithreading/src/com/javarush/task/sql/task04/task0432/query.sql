SELECT MONTHNAME(date) month,
       COUNT(*) count
FROM event
WHERE status = 'ERROR' OR status = 'FAILED'
GROUP BY month
ORDER BY count DESC
LIMIT 1