DROP TABLE IF EXISTS `part`;

CREATE TABLE `part`
(
    `id`     int(11)      NOT NULL AUTO_INCREMENT,
    `number` varchar(25)  NOT NULL,
    `name`   varchar(100) NOT NULL,
    `weight` float        NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 163
  DEFAULT CHARSET = utf8;


--
-- Dumping data for table `part`
--

LOCK TABLES `part` WRITE;

INSERT INTO `part`
VALUES (127, '98313', 'Arm Mechanical with Clip [Thick Support]', 0.4),
       (128, '99781', 'Bracket 1 x 2 - 1 x 2', 0.55),
       (129, '10201', 'Bracket 1 x 2 - 1 x 4 [Rounded Corners]', 0.93),
       (130, '93274', 'Bracket 1 x 2 - 2 x 4', 1.29),
       (131, '99780', 'Bracket 1 x 2 - 1 x 2 Inverted', 0.55),
       (132, '60476', 'Brick Special 1 x 1 with Clip Horizontal', 0.56),
       (133, '60475b', 'Brick Special 1 x 1 with Clip Vertical [Open O Clip, Hollow Stud]', 0.58),
       (134, '60475a', 'Brick Special 1 x 1 with Clip Vertical [Thick U Clip, Solid Stud]', 0.59),
       (135, '92338', 'Chain 5 links', 0.33),
       (136, '60596', 'Door Frame 1 x 4 x 6 Type 2', 3.2),
       (137, '18588', 'Launcher, Weapon Rapid Shooter Six Barrel', 2.8),
       (138, '61930', 'Light Unit, LED with Black Cable, Power Functions', 9.18),
       (139, '3710', 'Plate 1 x 4', 0.71),
       (140, '3021', 'Plate 2 x 3', 0.93),
       (141, '85861', 'Plate Round 1 x 1 with Open Stud', 0.1),
       (142, '6141', 'Plate Round 1 x 1 with Solid Stud', 0.12),
       (143, '3839b', 'Plate Special 1 x 2 with Handles [Flat Ends / Low Attachment]', 0.61),
       (144, '4697b', 'Pneumatic T-Piece (T Bar) [New Style]', 0.15),
       (145, '15790', 'Propeller 3 Blade 9 Diameter with Recessed Center', 1.89),
       (146, '2421', 'Propeller 3 Blade Small', 0.41),
       (147, '92842', 'Propeller 3 Blades 5 Diameter', 0.8),
       (148, '2479', 'Propeller 4 Blade 5 Diameter with Rounded Ends, Open Hub', 1.38),
       (149, '61409', 'Slope 18° 2 x 1 x 2/3 with 4 Slots', 0.3),
       (150, '54200', 'Slope 30° 1 x 1 x 2/3 (Cheese Slope)', 0.21),
       (151, '85984', 'Slope 30° 1 x 2 x 2/3', 0.34),
       (152, '3039', 'Slope 45° 2 x 2', 1.15),
       (153, '3039pr0015', 'Slope 45° 2 x 2 with Complex Control Panel with Red and Green Lamps Print', 1.15),
       (154, '3039pr0018', 'Slope 45° 2 x 2 with Silver Control Panel and Screen Print', 1.15),
       (155, '3747b', 'Slope Inverted 33° 3 x 2 [Connections between Studs]', 1.68),
       (156, '3660', 'Slope Inverted 45° 2 x 2 [Ovoid Bottom Pin, Bar-sized Stud Holes]', 1.25),
       (157, '4871', 'Slope Inverted 45° 4 x 2 Double', 1.82),
       (158, '45590', 'Technic Axle Connector Double Flexible [Rubber]', 0.59),
       (159, '3706', 'Technic Axle 6', 0.94),
       (160, '32034', 'Technic Axle and Pin Connector Angled #2 - 180°', 0.68),
       (161, '32016', 'Technic Axle and Pin Connector Angled #3 - 157.5°', 0.67),
       (162, '32015', 'Technic Axle and Pin Connector Angled #5 - 112.5°', 0.69);

UNLOCK TABLES;