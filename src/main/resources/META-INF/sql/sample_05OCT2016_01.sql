-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.41-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema itrack
--

CREATE DATABASE IF NOT EXISTS itrack;
USE itrack;

--
-- Definition of table `role`
--

DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `roleid` int(11) NOT NULL auto_increment,
  `rolename` varchar(45) NOT NULL,
  PRIMARY KEY  (`roleid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `role`
--

/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` (`roleid`,`rolename`) VALUES 
 (1,'admin'),
 (2,'user');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;


--
-- Definition of table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userid` int(11) NOT NULL auto_increment,
  `email` varchar(45) NOT NULL,
  `expDate` datetime default NULL,
  `firstName` varchar(45) default NULL,
  `isactive` varchar(255) default NULL,
  `isnonexpired` varchar(255) default NULL,
  `isnonlocked` varchar(255) default NULL,
  `lastName` varchar(45) default NULL,
  `password` varchar(45) NOT NULL,
  `phone` varchar(45) default NULL,
  `regdate` datetime default NULL,
  `username` varchar(45) NOT NULL,
  `roleid` int(11) NOT NULL,
  PRIMARY KEY  (`userid`),
  KEY `FK_6jfb22mx5nh0qym11cb92wqbg` (`roleid`),
  CONSTRAINT `FK_6jfb22mx5nh0qym11cb92wqbg` FOREIGN KEY (`roleid`) REFERENCES `role` (`roleid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user`
--

/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`userid`,`email`,`expDate`,`firstName`,`isactive`,`isnonexpired`,`isnonlocked`,`lastName`,`password`,`phone`,`regdate`,`username`,`roleid`) VALUES 
 (1,'sample@sample.com',NULL,NULL,'Y','Y','Y',NULL,'123',NULL,'2016-10-05 21:12:57','sample',1);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
