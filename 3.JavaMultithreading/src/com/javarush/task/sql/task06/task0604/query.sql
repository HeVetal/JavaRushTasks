DROP TABLE IF EXISTS users;

CREATE TABLE users
(
    user_id    INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(255),
    last_name  VARBINARY(255)
);