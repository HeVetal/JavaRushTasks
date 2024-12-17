SELECT name,
       MAX(price) AS max,
       MIN(price) AS min
FROM cars
GROUP BY name
