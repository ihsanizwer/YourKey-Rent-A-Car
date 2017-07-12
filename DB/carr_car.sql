-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: carr
-- ------------------------------------------------------
-- Server version	5.7.11-log

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
-- Table structure for table `car`
--

DROP TABLE IF EXISTS `car`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `car` (
  `CarID` int(11) NOT NULL AUTO_INCREMENT,
  `Model` varchar(20) DEFAULT NULL,
  `Make` varchar(20) DEFAULT NULL,
  `Year` int(11) DEFAULT NULL,
  `Seats` int(11) DEFAULT NULL,
  `Taken` tinyint(1) DEFAULT '0',
  `CarType` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`CarID`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `car`
--

LOCK TABLES `car` WRITE;
/*!40000 ALTER TABLE `car` DISABLE KEYS */;
INSERT INTO `car` VALUES (1,'CR-Z','Honda',2015,2,0,'Luxury'),(2,'370Z','Nissan',2015,2,0,'Luxury'),(3,'Cls-class','Mercedes-benz',2016,4,0,'Luxury'),(4,'Mustang','Ford',2016,4,0,'Luxury'),(5,'XC90','Volvo',2016,6,0,'Luxury'),(6,'E-Class','Mercedes-Benz',2016,6,0,'Luxury'),(7,'Lincoln Town Car','Sedan',2005,8,0,'Limousine'),(8,'S-Class','Mercedes-Benz',2008,8,0,'Limousine'),(9,'Dodge Magnum','Sedan',2005,10,0,'Limousine'),(10,'Chrysler 300','Sedan',2014,10,0,'Limousine'),(11,'Lincoln Town Car','Sedan',2007,12,0,'Limousine'),(12,'Chrysler 300','Sedan',2012,12,0,'Limousine'),(13,'Range Rover','Land Rover',2016,5,0,'Normal'),(14,'Civic','Honda',2016,5,0,'Normal'),(15,'Outlander','Mitsubishi',2016,6,0,'Normal'),(16,'Escalade ','Cadillac',2016,6,0,'Normal'),(17,'Grand Caravan','Dodge',2016,7,0,'Normal'),(18,'Sienna','Toyota',2016,7,0,'Normal'),(19,'Highlander','Toyota',2016,8,0,'Normal'),(20,'Pilot','Honda',2016,8,0,'Normal'),(21,'Golf Sportwagen','Volkswagen ',2016,5,0,'Wagons'),(22,'Prius V','Toyota',2016,5,0,'Wagons'),(23,'V60','Volvo',2016,5,0,'Wagons'),(24,'Outback','Subaru',2016,5,0,'Wagons');
/*!40000 ALTER TABLE `car` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-04-03 19:00:32
