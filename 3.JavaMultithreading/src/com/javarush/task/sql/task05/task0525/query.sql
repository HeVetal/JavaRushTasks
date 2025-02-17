SELECT full_name, COUNT(*) books
FROM book
         LEFT JOIN author ON book.author_id = author.id
GROUP BY book.author_id
HAVING books > 1
