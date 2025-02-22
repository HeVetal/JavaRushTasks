SELECT released,
       COUNT(*) total
FROM lego_set
GROUP BY released
ORDER BY total DESC