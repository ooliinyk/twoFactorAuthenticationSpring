-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: tfa33
-- ------------------------------------------------------
-- Server version	5.7.9-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `last_visited_accounts`
--

DROP TABLE IF EXISTS `last_visited_accounts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `last_visited_accounts` (
  `last_visited_accounts_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `account_id` int(11) NOT NULL,
  `order` int(11) NOT NULL,
  `date` date NOT NULL,
  `time` time NOT NULL,
  PRIMARY KEY (`last_visited_accounts_id`),
  UNIQUE KEY `last_visited_accounts_id_UNIQUE` (`last_visited_accounts_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `last_visited_accounts`
--

LOCK TABLES `last_visited_accounts` WRITE;
/*!40000 ALTER TABLE `last_visited_accounts` DISABLE KEYS */;
INSERT INTO `last_visited_accounts` VALUES (1,300102,1,3,'2016-08-12','11:12:31'),(8,300102,2,2,'2016-08-12','14:21:11'),(9,300102,3,4,'2016-08-11','11:08:22');
/*!40000 ALTER TABLE `last_visited_accounts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `last_visited_accounts1`
--

DROP TABLE IF EXISTS `last_visited_accounts1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `last_visited_accounts1` (
  `last_visited_accounts_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `account_id` varchar(20) NOT NULL,
  `order` int(11) NOT NULL,
  `date` datetime(6) NOT NULL,
  PRIMARY KEY (`last_visited_accounts_id`),
  UNIQUE KEY `last_visited_accounts_id_UNIQUE` (`last_visited_accounts_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `last_visited_accounts1`
--

LOCK TABLES `last_visited_accounts1` WRITE;
/*!40000 ALTER TABLE `last_visited_accounts1` DISABLE KEYS */;
INSERT INTO `last_visited_accounts1` VALUES (1,1,'1',1,'1993-01-02 02:02:02.000000'),(2,231,'2323',3232,'2016-08-19 09:15:12.000000'),(3,300102,'1',5,'2016-08-19 09:15:12.000000'),(4,300102,'4',6,'2013-08-18 08:13:02.000000'),(5,300102,'3',7,'2016-08-18 08:15:12.000000'),(6,300102,'3',22,'2016-10-18 08:15:12.000000'),(7,300102,'4',6,'2018-05-18 08:13:02.000000'),(8,300102,'10',6,'2017-08-18 08:13:02.000000'),(9,300102,'3',2,'2016-08-12 00:00:00.000000'),(10,300102,'3',3,'2016-08-12 00:00:00.000000'),(11,300103,'41',1,'2016-08-11 00:00:00.000000'),(12,300103,'44',2,'2016-08-11 00:00:00.000000');
/*!40000 ALTER TABLE `last_visited_accounts1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(45) NOT NULL,
  `desc` varchar(45) NOT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (101,'Admin','Admin'),(302,'USER','ads'),(303,'Sales2','Junior Sales User'),(999,'Test','Test');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userinfo`
--

DROP TABLE IF EXISTS `userinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `userinfo` (
  `userID` int(11) NOT NULL AUTO_INCREMENT,
  `roleID` int(11) NOT NULL,
  `first_name` varchar(60) NOT NULL,
  `last_name` varchar(60) NOT NULL,
  `adress` varchar(45) NOT NULL,
  `email` varchar(60) NOT NULL,
  `country_code` int(11) NOT NULL,
  `area_code` int(11) NOT NULL,
  `mobile` varchar(60) NOT NULL,
  PRIMARY KEY (`userID`),
  UNIQUE KEY `userID_UNIQUE` (`userID`),
  KEY `roleID_idx` (`roleID`),
  CONSTRAINT `role_ID` FOREIGN KEY (`roleID`) REFERENCES `role` (`role_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=1000000 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userinfo`
--

LOCK TABLES `userinfo` WRITE;
/*!40000 ALTER TABLE `userinfo` DISABLE KEYS */;
INSERT INTO `userinfo` VALUES (5,302,'dd','dd','dd','dd',22,2,'+380935546881'),(6,302,'user1','user1','user1','user1',22,2,'+380935546881'),(300101,302,'gordon','frois','Singapore','asdfadfadsf',65,0,'6591897325'),(300102,302,'user2','user2','user2','user2',22,22,'+380935546881'),(300103,303,'sales2','sales2','asdf','asdfadfadsf',65,0,'1111111111'),(300104,302,'sales1','sales1','asdf','asdfadfadsf',65,0,'1111111111'),(999999,999,'test2fa','test2fa','test','test',65,0,'6591897325');
/*!40000 ALTER TABLE `userinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userlogin`
--

DROP TABLE IF EXISTS `userlogin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `userlogin` (
  `user_id` int(11) NOT NULL,
  `login` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `TFA_FLAG` varchar(45) NOT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `user_id_UNIQUE` (`user_id`),
  UNIQUE KEY `login_UNIQUE` (`login`),
  CONSTRAINT `user_id` FOREIGN KEY (`user_id`) REFERENCES `userinfo` (`userID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userlogin`
--

LOCK TABLES `userlogin` WRITE;
/*!40000 ALTER TABLE `userlogin` DISABLE KEYS */;
INSERT INTO `userlogin` VALUES (5,'user','user','y'),(6,'user1','user1','N'),(300101,'gordon','gordon','N'),(300102,'user2','user2','N'),(300103,'sales2','sales2','N'),(999999,'test2fa','test2fa','y');
/*!40000 ALTER TABLE `userlogin` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-08-21 13:17:50
