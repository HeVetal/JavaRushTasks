DROP TABLE IF EXISTS `publisher`;

CREATE TABLE `publisher`
(
    `id`   int NOT NULL,
    `name` varchar(100) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;


LOCK TABLES `publisher` WRITE;

INSERT INTO `publisher`
VALUES (0, 'Фолио'),
       (1, 'Азбука'),
       (2, 'Фолио'),
       (3, 'Авторское издание');

UNLOCK TABLES;