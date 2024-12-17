SELECT name,
       SUM(price)
FROM cars
GROUP BY name