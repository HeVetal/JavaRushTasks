SELECT isbn, title
FROM book
         LEFT JOIN author ON book.author_id = author.id
WHERE author.last_name LIKE 'S%'