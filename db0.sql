/*
SQLyog Ultimate v12.08 (32 bit)
MySQL - 5.7.21 : Database - db0
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db0` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `db0`;

/*Table structure for table `author` */

DROP TABLE IF EXISTS `author`;

CREATE TABLE `author` (
  `id` varchar(32) NOT NULL,
  `name` varchar(32) DEFAULT NULL,
  `gender` char(3) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `phone` char(11) DEFAULT NULL,
  `longitude` varchar(32) DEFAULT NULL,
  `latitude` varchar(32) DEFAULT NULL,
  `address` varchar(64) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `author` */

insert  into `author`(`id`,`name`,`gender`,`age`,`phone`,`longitude`,`latitude`,`address`,`create_time`,`update_time`) values ('000001','James Gosling','男',56,'15268987382','116.3220399700','39.8948956700','北京市丰台区太平桥街道北京西站','2020-04-10 10:45:36','2020-04-10 10:45:36'),('000002','Dennis MacAlistair Ritchie','男',62,'13868987382','121.4737499300','31.2304404000','上海市黄浦区南京东路街道上海市人民政府','2020-04-10 10:47:14','2020-04-10 10:47:14');

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

insert  into `book_0`(`book_id`,`book_name`,`author_id`,`author_name`,`create_time`,`update_time`) values ('1248522530159251458','《C++入门指南》','000002','Dennis MacAlistair Ritchie','2020-04-10 16:05:42','2020-04-10 16:05:42');

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
