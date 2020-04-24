/*
SQLyog Ultimate v12.08 (32 bit)
MySQL - 5.7.21 : Database - db1
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db1` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `db1`;

/*Table structure for table `book_0` */

DROP TABLE IF EXISTS `book_0`;

CREATE TABLE `book_0` (
  `book_id` varchar(32) NOT NULL,
  `book_name` varchar(255) DEFAULT NULL,
  `author_id` varchar(32) DEFAULT NULL,
  `author_name` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `book_0` */

/*Table structure for table `book_1` */

DROP TABLE IF EXISTS `book_1`;

CREATE TABLE `book_1` (
  `book_id` varchar(32) NOT NULL,
  `book_name` varchar(255) DEFAULT NULL,
  `author_id` varchar(32) DEFAULT NULL,
  `author_name` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `book_1` */

/*Table structure for table `login_user_0` */

DROP TABLE IF EXISTS `login_user_0`;

CREATE TABLE `login_user_0` (
  `row_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `id` char(18) NOT NULL,
  `name` varchar(32) DEFAULT NULL,
  `gender` char(3) NOT NULL,
  `age` tinyint(1) unsigned DEFAULT NULL,
  `phone` char(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `row_id` (`row_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `login_user_0` */

/*Table structure for table `login_user_1` */

DROP TABLE IF EXISTS `login_user_1`;

CREATE TABLE `login_user_1` (
  `row_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `id` char(18) NOT NULL,
  `name` varchar(32) DEFAULT NULL,
  `gender` char(3) NOT NULL,
  `age` tinyint(1) unsigned DEFAULT NULL,
  `phone` char(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `row_id` (`row_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `login_user_1` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
