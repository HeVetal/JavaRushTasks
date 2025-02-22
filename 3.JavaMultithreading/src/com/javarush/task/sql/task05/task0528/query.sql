SELECT DISTINCT publisher.name
FROM book
         LEFT JOIN author ON book.author_id = author.id
         LEFT JOIN publisher ON book.publisher_id = publisher.id
WHERE author.full_name = 'Mark Twain'
GROUP BY publisher.name