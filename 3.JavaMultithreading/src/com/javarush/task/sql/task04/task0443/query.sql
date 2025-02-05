SELECT city, CHAR_LENGTH(city) AS lenth
FROM cities
ORDER BY lenth DESC
LIMIT 3