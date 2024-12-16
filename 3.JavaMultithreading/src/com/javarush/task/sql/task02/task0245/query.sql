SELECT name,
       COUNT(*) AS count
FROM cars
GROUP BY name
HAVING count > 1