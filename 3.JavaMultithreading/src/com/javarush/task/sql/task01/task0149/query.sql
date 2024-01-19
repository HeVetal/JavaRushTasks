-- `identifier`  VARCHAR(50) not null,
SELECT *
FROM parts
WHERE description IS NOT NULL
   OR identifier IS NULL
