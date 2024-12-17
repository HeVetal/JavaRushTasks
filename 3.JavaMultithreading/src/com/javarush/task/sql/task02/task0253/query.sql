SELECT name,
       SUM(price) AS prices
FROM cars
GROUP BY name
HAVING prices > 200000