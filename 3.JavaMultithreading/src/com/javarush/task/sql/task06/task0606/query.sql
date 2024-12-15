DROP TABLE IF EXISTS team;

CREATE TABLE team
(
    position  VARCHAR(100),
    full_name VARCHAR(100),
    number    INT
);

INSERT INTO team (position, full_name, number)
VALUES ('Goalkeeper', 'Lev Yashin', 1),
       ('Right-back', 'Cafu n', 2),
       ('Centre-back', 'Franz Beckenbauer', 3),
       ('Centre-back', 'Bobby Moore', 4),
       ('Left-back', 'Paolo Maldini', 5),
       ('Midfield', 'Johan Cruyff', 6),
       ('Midfield', 'Zinedine Zidane', 7),
       ('Midfield', 'Andrea Pirlo', 8),
       ('Midfield', 'Lothar Matthaus', 9),
       ('Striker', 'Pele', 10),
       ('Forward', 'Marco van Basten', 11);