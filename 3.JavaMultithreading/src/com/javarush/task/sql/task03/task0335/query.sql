SELECT author.country AS author_country,
       COUNT(book.book_id) AS book_count
FROM authors AS author JOIN books AS book
    ON author.author_id = book.author_id
WHERE book.genre LIKE 'novel'
GROUP BY author.country
HAVING book_count > 2