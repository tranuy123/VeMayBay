-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: banvemaybay1
-- ------------------------------------------------------
-- Server version	8.0.31

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
-- Table structure for table `khachhang`
--

DROP TABLE IF EXISTS `khachhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `khachhang` (
  `SDT` char(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `EMAIL` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `PASS` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`SDT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `khachhang`
--

LOCK TABLES `khachhang` WRITE;
/*!40000 ALTER TABLE `khachhang` DISABLE KEYS */;
INSERT INTO `khachhang` VALUES ('0111111111','datdaodien@gmail.com','1'),('012345','tranletienhoa@gmail.com','1'),('012345666','VOTRANUY2001@GMAIL.COM','123'),('0123456777','VOTRANUY2001@GMAIL.COM','123'),('0123456789','lan@gmail.com','1'),('0123578946','dat@gmail.com','147'),('0123654789','hoa@gmail.com','654'),('0135798647','lai@gmail.com','789'),('0147258369','huong@gmail.com','321'),('030303','culoc147@gmail.com','1'),('0312598746','uy@gmail.com','987'),('0321654987','hong@gmail.com','123'),('03264976','votranuy2001@gmail.com','1'),('0327575961','CULOC147@GMAIL.COM','ANHLOC123'),('0369258147','thanhy@gmail.com','456'),('0786126493','tranuy30092001@gmail.com','1'),('0987','culoc146@gmail.com','1'),('1212121212','tranlinhtt95@gmail.com','1'),('123','culoc147@gmail.com','1'),('1234','culoc147@gmail.com','1'),('12345','culoc47@gmail.com','1'),('123456','votranuy2001@gmail.com','1'),('1234567','votranuy2001@gmail.com','1'),('213123','culoc147@gmail.com','1'),('2131231233','culoc147@gmail.com','1'),('22','culoc147@gmail.com','1'),('232323','tranuy30092001@gmail.com','1'),('456','tranuy30092001@gmail.com','1'),('4564564','datdaodien@gmail.com','1'),('4567','tranuy30092001@gmail.com','1'),('8989','culoc146@gmail.com','1');
/*!40000 ALTER TABLE `khachhang` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-09 21:32:26
