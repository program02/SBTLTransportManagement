CREATE DATABASE  IF NOT EXISTS `dbtransport` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `dbtransport`;
-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: dbtransport
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `ticket`
--

DROP TABLE IF EXISTS `ticket`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ticket` (
  `id` bigint NOT NULL,
  `arival_time` varchar(255) DEFAULT NULL,
  `available_seats` int DEFAULT NULL,
  `booked_seats` int DEFAULT NULL,
  `coach_no` varchar(255) DEFAULT NULL,
  `coach_type` varchar(255) DEFAULT NULL,
  `departing_time` varchar(255) DEFAULT NULL,
  `description1` varchar(255) DEFAULT NULL,
  `destination` varchar(255) DEFAULT NULL,
  `discount` float DEFAULT NULL,
  `end_counter` varchar(255) DEFAULT NULL,
  `journey_date` date DEFAULT NULL,
  `seat01` varchar(255) DEFAULT NULL,
  `seat02` varchar(255) DEFAULT NULL,
  `seat03` varchar(255) DEFAULT NULL,
  `seat04` varchar(255) DEFAULT NULL,
  `seat05` varchar(255) DEFAULT NULL,
  `seat06` varchar(255) DEFAULT NULL,
  `seat07` varchar(255) DEFAULT NULL,
  `seat08` varchar(255) DEFAULT NULL,
  `seat09` varchar(255) DEFAULT NULL,
  `seat10` varchar(255) DEFAULT NULL,
  `seat11` varchar(255) DEFAULT NULL,
  `seat12` varchar(255) DEFAULT NULL,
  `seat13` varchar(255) DEFAULT NULL,
  `seat14` varchar(255) DEFAULT NULL,
  `seat15` varchar(255) DEFAULT NULL,
  `seat16` varchar(255) DEFAULT NULL,
  `source` varchar(255) DEFAULT NULL,
  `start_counter` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `total_fare` float DEFAULT NULL,
  `total_seats` int DEFAULT NULL,
  `transport_name` varchar(255) DEFAULT NULL,
  `unit_fare` float DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticket`
--

LOCK TABLES `ticket` WRITE;
/*!40000 ALTER TABLE `ticket` DISABLE KEYS */;
INSERT INTO `ticket` VALUES (1,'2030',0,0,'H01','AC','1230','a','Khulna',0,'a','2020-10-20','available','available','available','available','available','available','available','available','available','available','available','available','available','available','available','available','Dhaka','a','a',0,16,'Hanif',500),(2,'2130',8,8,'','','1330','','Khulna',0,'',NULL,'booked','booked','booked','booked','booked','booked','available','available','available','available','available','available','booked','booked','available','available','Dhaka','','',1200,16,'Hanif',400),(3,'2130',14,2,'','','1330','','Dhaka',0,'',NULL,'booked','available','available','available','booked','available','available','available','available','available','available','available','available','available','available','available','Mymensing','','',800,16,'ena',400);
/*!40000 ALTER TABLE `ticket` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-11-07 13:09:30
