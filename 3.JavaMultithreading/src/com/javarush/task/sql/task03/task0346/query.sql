SELECT *
FROM films
         JOIN (SELECT year_born, id
               FROM film_directors
               WHERE year_born < 1940) director ON films.director_id = director.id
WHERE films.genre = 'sci-fi'