SELECT name,
       SUM(price),
       AVG(price)
FROM cars
GROUP BY name