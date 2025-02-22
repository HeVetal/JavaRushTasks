SELECT author.full_name,
       COUNT(*) publishers
FROM author
         LEFT JOIN book ON book.author_id = author.id
         LEFT JOIN publisher ON book.publisher_id = publisher.id
GROUP BY author.id