SELECT DISTINCT title
FROM book
         LEFT JOIN author ON book.author_id = author.id
WHERE author.full_name = 'Edgar Allan Poe'