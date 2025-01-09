SELECT author.last_name AS author,
       book.genre       AS book_genre,
       book.date_released
FROM authors AS author
         RIGHT JOIN books AS book
                    ON author.author_id = book.author_id
WHERE book.date_released < 1900
GROUP BY book.genre, book.date_released