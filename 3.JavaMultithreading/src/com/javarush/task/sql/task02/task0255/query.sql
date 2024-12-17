SELECT name,
       MAX(price) AS max,
       MIN(price) AS min
FROM cars
GROUP BY name
HAVING max < 200000