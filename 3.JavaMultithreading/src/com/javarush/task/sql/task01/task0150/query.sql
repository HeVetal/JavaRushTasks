-- `identifier`  VARCHAR(50) not null,
SELECT *
FROM parts
WHERE id BETWEEN 7 AND 23
AND identifier IS NULL
LIMIT 2
