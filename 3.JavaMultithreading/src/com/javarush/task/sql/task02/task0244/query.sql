SELECT YEAR(prod_date)  AS prod_year,
       MONTH(prod_date) AS prod_month,
       COUNT(*)
FROM cars
WHERE name = 'Black Car' AND price > 99000
GROUP BY prod_year, prod_month