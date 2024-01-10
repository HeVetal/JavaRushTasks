SELECT description
FROM parts
ORDER BY required DESC, identifier DESC, description DESC
LIMIT 100 OFFSET 23
-- в таблице только 18 значений