SELECT book.publication_year,
       book.isbn,
       book.title,
       author.full_name author,
       publisher.name publisher
FROM book
        LEFT JOIN author ON book.author_id = author.id
        LEFT JOIN publisher ON book.publisher_id = publisher.id
