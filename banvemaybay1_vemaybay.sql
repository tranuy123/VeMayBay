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
-- Table structure for table `vemaybay`
--

DROP TABLE IF EXISTS `vemaybay`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vemaybay` (
  `MAVE` int DEFAULT NULL,
  `MACB` int NOT NULL,
  `GIA` int NOT NULL,
  `SDT` char(10) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci NOT NULL,
  `EMAIL` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `TENKH` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci NOT NULL,
  `GIOITINH` char(5) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci NOT NULL,
  `CCCD` char(15) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci NOT NULL,
  `NGAYSINH` date NOT NULL,
  `TGDV` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vemaybay`
--

LOCK TABLES `vemaybay` WRITE;
/*!40000 ALTER TABLE `vemaybay` DISABLE KEYS */;
INSERT INTO `vemaybay` VALUES (303282,5,650000,'1234','culoc147@gmail.com','yt','Nam','10','2022-08-18','2022-08-20 14:02:21'),(303282,5,650000,'1234','culoc147@gmail.com','yt','Nam','11','2022-08-18','2022-08-20 14:02:21'),(303282,1,1800000,'1234','culoc147@gmail.com','võ trần uy','Nam','12','2022-08-17','2022-08-20 14:20:15'),(303282,1,1800000,'1234','culoc147@gmail.com','võ trần uy','Nam','121','2022-08-17','2022-08-20 14:39:10'),(846694,1,1800000,'123','culoc147@gmail.com','lộc','Nam','12121212','2022-08-15','2022-08-20 23:53:35'),(111,1,1800000,'1234','culoc147@gmail.com','võ trần uy 1 ','Nam','122','2022-08-02','2022-08-20 14:42:40'),(303282,1,1800000,'1234','culoc147@gmail.com','quý ','Nam','123','2022-08-22','2022-08-20 14:31:06'),(742199,1,1800000,'1212121212','tranlinhtt95@gmail.com','võ trần linh','Nam','12311232','2022-08-03','2022-08-21 00:13:54'),(974032,1,1800000,'123','culoc147@gmail.com','võ trần uy 2','Nam','123123123123','2022-08-10','2022-08-20 23:34:01'),(278710,1,1800000,'1212121212','tranlinhtt95@gmail.com','võ trần uy','Nam','12312312312311','2022-08-22','2022-08-21 00:15:19'),(977306,1,1800000,'1234','culoc147@gmail.com','võ trần uy','Nam','123124','2022-08-16','2022-08-20 17:39:36'),(16802,5,650000,'123','culoc147@gmail.com','võ trần uy','Nam','123456','2022-08-21','2022-08-20 23:46:41'),(303282,1,1800000,'1234','culoc147@gmail.com','võ trần uy','Nam','13','2022-08-17','2022-08-20 14:20:15'),(303282,1,1800000,'1234','culoc147@gmail.com','võ trần uy','Nam','15','2022-08-22','2022-08-20 14:23:54'),(303282,5,650000,'1234','culoc147@gmail.com','lộc','Nam','2','2022-08-22','2022-08-20 13:03:33'),(414748,84,638000,'123','culoc147@gmail.com','võ trần uy','Nam','23112332','2022-08-04','2022-08-21 16:12:00'),(NULL,1,1800000,'123','culoc147@gmail.com','võ trần uy','Nam','234234','2022-08-15','2022-08-20 23:20:37'),(214595,175,1850000,'123','culoc147@gmail.com','ưerwer','Nam','23423423','2022-08-30','2022-08-21 16:25:19'),(303282,5,650000,'1234','culoc147@gmail.com','lộc','Nam','3','2022-08-22','2022-08-20 13:04:38'),(351860,1,1800000,'1234','culoc147@gmail.com','uy11','Nam','323','2022-08-15','2022-08-20 21:09:15'),(981882,1,1800000,'1234','culoc147@gmail.com','võ trần uy 3 ','Nam','32321','2022-08-02','2022-08-20 14:55:04'),(1205184,1,1800000,'1234','culoc147@gmail.com','nhặc','Nam','332','2022-08-23','2022-08-20 17:33:48'),(735849,1,1800000,'123','culoc147@gmail.com','ád','Nam','3412','2022-08-02','2022-08-20 23:54:52'),(182821,1,1800000,'4564564','datdaodien@gmail.com','đạt','Nam','342122','2022-08-22','2022-08-21 11:35:46'),(727619,1,1800000,'1212121212','tranlinhtt95@gmail.com','uy','Nam','3434','2022-08-16','2022-08-21 11:20:57'),(303282,1,1800000,'1234','culoc147@gmail.com','uy','Nam','4','2022-08-11','2022-08-20 13:20:11'),(303282,5,650000,'1234','culoc147@gmail.com','võ trần uy','Nam','42','2022-08-16','2022-08-20 14:27:45'),(303282,1,1800000,'1234','culoc147@gmail.com','lộc','Nam','43','2022-08-11','2022-08-20 14:26:52'),(845373,1,1800000,'123','culoc147@gmail.com','võ trần uy 2 ','Nam','4353','2022-08-09','2022-08-21 00:09:52'),(303282,1,1800000,'1234','culoc147@gmail.com','uy','Nam','44','2022-08-15','2022-08-20 14:25:56'),(NULL,1,1800000,'','','võ trần uy','Nam','45','2022-08-30','2022-08-20 14:24:35'),(242826,5,650000,'1234','culoc147@gmail.com','võ trần uy','Nam','456','2022-08-23','2022-08-20 17:30:41'),(494364,1,1800000,'1234','culoc147@gmail.com','võ trần uy 2 ','Nam','45643','2022-08-22','2022-08-21 14:47:19'),(879060,1,1800000,'1212121212','tranlinhtt95@gmail.com','võ trần uy','Nam','4564564','2022-08-17','2022-08-21 00:18:48'),(303282,5,650000,'1234','culoc147@gmail.com','lộc','Nam','5','2022-08-09','2022-08-20 13:05:21'),(1086234,1,1800000,'1212121212','tranlinhtt95@gmail.com','võ trần uy','Nam','5674','2022-08-23','2022-08-21 00:24:08'),(6999,1,1800000,'1212121212','tranlinhtt95@gmail.com','võ trần uy','Nam','56865','2022-08-22','2022-08-21 00:25:32'),(303282,1,1800000,'1234','culoc147@gmail.com','lộc','Nam','6','2022-08-21','2022-08-20 13:09:14'),(384752,1,1800000,'123','culoc147@gmail.com','võ trần uy','Nam','6456456','2022-08-02','2022-08-21 12:36:26'),(135402,4,638000,'123','culoc147@gmail.com','võ trần uy 2 ','Nữ','657567','2022-08-15','2022-08-21 00:06:34'),(609308,5,650000,'123','culoc147@gmail.com','võ trần uy','Nam','67967','2022-08-24','2022-08-20 23:55:52'),(303282,1,1800000,'1234','culoc147@gmail.com','yt','Nam','7','2022-08-08','2022-08-20 13:29:36'),(810948,5,650000,'123','culoc147@gmail.com','võ trần uy','Nam','7608707','2022-08-01','2022-08-20 23:56:24'),(NULL,1,1800000,'1234','culoc147@gmail.com','võ trần uy','Nam','76767','2022-08-17','2022-08-20 14:53:28'),(303282,1,1800000,'1234','culoc147@gmail.com','lộc','Nam','8','2022-08-22','2022-08-20 13:52:43'),(303282,1,1800000,'123','culoc147@gmail.com','uy','Nam','9','2022-08-25','2022-08-20 14:01:35'),(NULL,1,1800000,'123','culoc147@gmail.com','võ trần uy 1 ','Nam','sdfsdf','2022-08-09','2022-08-20 23:26:02'),(1218999,1,1800000,'1234','culoc147@gmail.com','võ trần uy','Nữ','10','2022-08-02','2022-08-21 16:59:17'),(NULL,5,650000,'1234','culoc147@gmail.com','ádaad','Nam','10','2022-08-08','2022-08-21 17:09:59'),(NULL,5,650000,'1234','culoc147@gmail.com','ádaad','Nam','10','2022-08-08','2022-08-21 17:09:59'),(NULL,5,650000,'1234','culoc147@gmail.com','võ trần uy','Nam','10','2022-08-15','2022-08-21 17:21:46'),(NULL,1,1800000,'1234','culoc147@gmail.com','võ trần uy','Nam','10','2022-08-16','2022-08-21 17:39:22'),(718434,1,1800000,'1234','culoc147@gmail.com','võ trần uy','Nam','2323','2022-08-08','2022-08-21 17:42:17'),(33528,2137,650000,'123456','votranuy2001@gmail.com','Thảo Huyền','Nam','89989','2022-08-10','2022-08-22 08:49:07'),(481741,2168,890000,'1234567','votranuy2001@gmail.com','Thanh Ý','Nam','56756756','2022-08-03','2022-08-22 08:55:02'),(1177950,625,1930000,'1234567','votranuy2001@gmail.com','Lai Thai','Nam','565653','2022-08-03','2022-08-22 09:05:33'),(893192,2512,685000,'1234567','votranuy2001@gmail.com','Anh Lộc','Nam','456456456','2022-08-01','2022-08-22 09:07:19'),(356501,2512,685000,'1234567','votranuy2001@gmail.com','ádasd','Nam','456456456','2022-08-25','2022-08-22 09:08:15'),(281238,2512,685000,'1234567','votranuy2001@gmail.com','Tiến Hòa ','Nam','456456456','2022-08-01','2022-08-22 09:13:07'),(302632,631,1750000,'012345','tranletienhoa@gmail.com','Tiến Hòa ','Nam','34534534','2022-08-20','2022-08-22 09:32:55'),(257129,2440,685000,'0111111111','datdaodien@gmail.com','Đạt','Nam','23423','2022-08-24','2022-08-22 09:42:21'),(604450,2440,685000,'0111111111','datdaodien@gmail.com','Tiến Hòa ','Nam','23423','2022-08-18','2022-08-22 09:54:08'),(319862,2138,930000,'0111111111','datdaodien@gmail.com','Tiến Hòa ','Nam','456456','2022-08-08','2022-08-22 10:06:07'),(807696,2464,685000,'123','culoc147@gmail.com','võ trần uy','Nam','332','2022-08-23','2022-08-22 10:57:47'),(342400,2440,685000,'1234','culoc147@gmail.com','võ trần uy','Nam','67567567','2022-08-19','2022-08-22 11:31:29'),(1255148,1,1800000,'0123456777','VOTRANUY2001@GMAIL.COM','Châu','Nam','090909090909','2001-02-21','2022-12-29 23:12:30');
/*!40000 ALTER TABLE `vemaybay` ENABLE KEYS */;
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
