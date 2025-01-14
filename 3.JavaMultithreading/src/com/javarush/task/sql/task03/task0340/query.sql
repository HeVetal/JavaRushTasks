SELECT * FROM authors
WHERE author_id NOT IN(
    SELECT author_id FROM books
        WHERE author_id IS NOT NULL AND genre = 'novel')