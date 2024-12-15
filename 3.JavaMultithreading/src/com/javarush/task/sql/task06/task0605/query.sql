DROP TABLE IF EXISTS users;

CREATE TABLE users
(
    user_id    INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    first_name VARCHAR(255)       NOT NULL,
    last_name  VARCHAR(255)       NOT NULL,
    date       DATE               NOT NULL DEFAULT CURRENT_DATE,
#     date       DATE               NOT NULL DEFAULT GETDATE(), ???
    weight     FLOAT

);