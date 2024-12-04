SELECT
       CASE
           WHEN IFNULL(euro, 6) > 5 THEN 'best'
           WHEN euro = 5 Then 'good'
           ELSE 'bad'
        END
FROM cars

