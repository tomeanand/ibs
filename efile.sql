# MySQL-Front 3.2  (Build 6.11)

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES 'latin1' */;

# Host: localhost    Database: efile
# ------------------------------------------------------
# Server version 5.5.24-log

DROP DATABASE IF EXISTS `efile`;
CREATE DATABASE `efile` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `efile`;
/*!40101 SET NAMES utf8 */;


#
# Table structure for table file_info
#

CREATE TABLE `file_info` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `userId` varchar(100) NOT NULL,
  `year` varchar(11) NOT NULL,
  `fileName` varchar(400) NOT NULL,
  `filePath` varchar(400) NOT NULL,
  `fileContentType` varchar(400) NOT NULL,
  `lastUpdatedTmstmp` datetime NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=MyISAM AUTO_INCREMENT=107 DEFAULT CHARSET=utf8;

#
# Dumping data for table file_info
#

INSERT INTO `file_info` (`Id`,`userId`,`year`,`fileName`,`filePath`,`fileContentType`,`lastUpdatedTmstmp`) VALUES (104,'30','1960','table_tennis.txt','D:\\temp\\ADD12345\\1960','text/plain','2012-07-22 00:00:00');
INSERT INTO `file_info` (`Id`,`userId`,`year`,`fileName`,`filePath`,`fileContentType`,`lastUpdatedTmstmp`) VALUES (105,'30','1960','pg.txt','D:\\temp\\ADD12345\\1960','text/plain','2012-07-22 00:00:00');
INSERT INTO `file_info` (`Id`,`userId`,`year`,`fileName`,`filePath`,`fileContentType`,`lastUpdatedTmstmp`) VALUES (106,'30','1960','login.html','D:\\temp\\30\\1960','text/plain','2012-07-22 00:00:00');

#
# Table structure for table user_info
#

CREATE TABLE `user_info` (
  `uid` varchar(11) NOT NULL,
  `userName` varchar(100) NOT NULL,
  `password` varchar(200) NOT NULL,
  `firstName` varchar(50) NOT NULL DEFAULT '',
  `middleName` varchar(50) NOT NULL,
  `lastName` varchar(50) NOT NULL,
  `fathersName` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `phone` varchar(100) NOT NULL,
  `address` varchar(255) NOT NULL,
  `pin` varchar(12) NOT NULL,
  `residenceStatus` varchar(100) NOT NULL,
  `gender` varchar(6) NOT NULL DEFAULT '',
  `dob` date NOT NULL,
  `pan` varchar(255) NOT NULL DEFAULT '',
  PRIMARY KEY (`uid`)
) ENGINE=MyISAM AUTO_INCREMENT=32 DEFAULT CHARSET=latin1;

#
# Dumping data for table user_info
#

/*!40101 SET NAMES latin1 */;

INSERT INTO `user_info` (`uid`,`userName`,`password`,`firstName`,`middleName`,`lastName`,`fathersName`,`email`,`phone`,`address`,`pin`,`residenceStatus`,`gender`,`dob`,`pan`) VALUES ('30','preenu','hello','preenu','n','nakulan','pnakul','preenu@efile.com','1223333','vars golden','898888','resident','male','2010-03-03','ADD12345');
INSERT INTO `user_info` (`uid`,`userName`,`password`,`firstName`,`middleName`,`lastName`,`fathersName`,`email`,`phone`,`address`,`pin`,`residenceStatus`,`gender`,`dob`,`pan`) VALUES ('ADD4567','Nakulan','hello','Nakulan','M','Test','PN','preenu@x.com','1233222','vars golden','45444','Resident','male','2012-07-21','ADD4567');

/*!40101 SET NAMES utf8 */;

/*!40101 SET NAMES latin1 */;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
