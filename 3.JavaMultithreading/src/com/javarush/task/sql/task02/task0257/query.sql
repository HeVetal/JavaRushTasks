SELECT name,
       AVG(price) AS avg,
       SUM(price)
FROM cars
GROUP BY name
HAVING avg > 100000