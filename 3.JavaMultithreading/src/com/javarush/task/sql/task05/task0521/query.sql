SELECT CONCAT(number, ', ', name) full_name
FROM lego_set
ORDER BY CHAR_LENGTH(name)