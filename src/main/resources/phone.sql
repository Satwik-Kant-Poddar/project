CREATE DATABASE  IF NOT EXISTS `phone_directory`;
USE `phone_directory`;

CREATE TABLE `phone` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `display` varchar(100) DEFAULT NULL,
  `os` varchar(100) DEFAULT NULL,
  `body_type` varchar(100) DEFAULT NULL,
  `memory` varchar(100) DEFAULT NULL,
  `camera` varchar(100) DEFAULT NULL,
  `sound` varchar(100) DEFAULT NULL,
  `battery` varchar(100) DEFAULT NULL,
  `charing` varchar(100) DEFAULT NULL,
  `launch_date` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;