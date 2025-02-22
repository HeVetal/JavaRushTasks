SELECT number,
       COUNT(*) total
FROM lego_set
WHERE number < 10000
GROUP BY number
ORDER BY total DESC