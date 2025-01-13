SELECT *
FROM authors
WHERE author_id !=
      (SELECT author_id FROM books WHERE author_id = 7 AND title = 'War and Peace')