SELECT *
FROM authors
WHERE full_name NOT LIKE (SELECT CONCAT(full_name, ' ', last_name)
                          FROM authors
                          WHERE last_name = 'Shakespeare')