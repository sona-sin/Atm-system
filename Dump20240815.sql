CREATE DATABASE  IF NOT EXISTS `bankmanagementsystem` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `bankmanagementsystem`;
-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: bankmanagementsystem
-- ------------------------------------------------------
-- Server version	8.0.36

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
-- Table structure for table `bank`
--

DROP TABLE IF EXISTS `bank`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bank` (
  `pin` varchar(20) DEFAULT NULL,
  `date` varchar(50) DEFAULT NULL,
  `type` varchar(50) DEFAULT NULL,
  `amount` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bank`
--

LOCK TABLES `bank` WRITE;
/*!40000 ALTER TABLE `bank` DISABLE KEYS */;
INSERT INTO `bank` VALUES ('6891','Thu Mar 28 15:39:14 IST 2024','Deposit','10000'),('6891','Thu Mar 28 17:18:32 IST 2024','Deposit','10000'),('','Thu Mar 28 18:37:55 IST 2024','Withdrawl','0'),('6891','Thu Mar 28 18:41:58 IST 2024','Deposit','100000'),('6891','Thu Mar 28 18:43:21 IST 2024','Deposit','354657'),('1212','Thu Apr 04 15:24:20 IST 2024','Deposit','100000'),('','Thu Apr 04 15:48:12 IST 2024','Withdraw','1000'),('','Thu Apr 04 20:57:41 IST 2024','Withdraw','1000'),('','Thu Apr 04 21:00:39 IST 2024','Withdraw','1'),('','Thu Apr 04 22:10:21 IST 2024','Withdraw','2000'),('1212','Thu Apr 04 22:22:46 IST 2024','Deposit','100000'),('1212','Thu Apr 04 22:22:54 IST 2024','Withdraw','100'),('1212','Thu Apr 04 22:23:00 IST 2024','Withdraw','1000'),('1212','Thu Apr 04 22:25:55 IST 2024','Deposit','20000'),('1212','Thu Apr 04 22:26:03 IST 2024','Withdraw','1000'),('1212','Thu Apr 04 22:26:10 IST 2024','Withdraw','2000'),('1212','Fri Apr 05 20:27:13 IST 2024','Deposit','100000'),('1212','Fri Apr 05 20:27:24 IST 2024','Withdraw','1000'),('1212','Fri Apr 05 20:27:29 IST 2024','Withdraw','100'),('1212','Fri Apr 05 20:48:01 IST 2024','Withdraw','111'),('1212','Fri Apr 05 20:48:10 IST 2024','Withdraw','1000'),('','Fri Apr 05 21:25:53 IST 2024','Withdraw','10000'),('','Fri Apr 05 21:42:32 IST 2024','Withdraw','100'),('','Fri Apr 05 21:42:51 IST 2024','Deposit','1000'),('','Fri Apr 05 21:43:10 IST 2024','Deposit','1000'),('','Fri Apr 05 21:43:33 IST 2024','Withdraw','5000'),('','Fri Apr 05 21:43:56 IST 2024','Withdraw','100'),('','Fri Apr 05 21:44:27 IST 2024','Withdraw','100'),('0000','Fri May 10 20:14:44 IST 2024','Deposit','20000'),('0000','Fri May 10 20:14:57 IST 2024','Withdraw','1000'),('0000','Fri May 10 20:15:09 IST 2024','Withdraw','1000'),('0000','Fri May 10 20:15:19 IST 2024','Withdraw','100'),('','Fri May 10 20:45:20 IST 2024','Withdraw','500'),('','Fri May 10 20:47:25 IST 2024','Withdraw','10000'),('','Sat May 11 00:19:56 IST 2024','Deposit','200000'),('0000','Sat May 11 00:23:08 IST 2024','Deposit','2000'),('','Sat May 11 00:23:57 IST 2024','Withdraw','1000'),('','Sat May 11 00:24:08 IST 2024','Deposit','20000'),('','Sat May 11 00:24:17 IST 2024','Withdraw','1000'),('0000','Sat May 11 00:38:39 IST 2024','Deposit','6798997987'),('0000','Mon May 13 20:57:30 IST 2024','Deposit','1000');
/*!40000 ALTER TABLE `bank` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `login` (
  `formno` varchar(20) DEFAULT NULL,
  `cardNumber` varchar(25) DEFAULT NULL,
  `pin` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES ('2805','69372515040936000000000','2095'),('4589','363408495040936000000000','6891'),('1155','116218385040936000000000','1212'),('7447','447284755040936000000000','0000');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `signup`
--

DROP TABLE IF EXISTS `signup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `signup` (
  `formno` varchar(50) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `father_name` varchar(20) DEFAULT NULL,
  `dob` varchar(20) DEFAULT NULL,
  `gender` varchar(20) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `mobile_number` varchar(50) DEFAULT NULL,
  `marrital_status` varchar(20) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `city` varchar(20) DEFAULT NULL,
  `state` varchar(20) DEFAULT NULL,
  `pincode` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `signup`
--

LOCK TABLES `signup` WRITE;
/*!40000 ALTER TABLE `signup` DISABLE KEYS */;
INSERT INTO `signup` VALUES ('9019','sonam singh','vinod singh','27-Mar-2024','FEMALE','sonamsingh04553@gmail.com','7985541115','UMNARRIED','1408 narayanpuri naubasta kanpur','kanpur nagar','uttar pradesh','208021'),('4896','42378','','','FEMALE','','','other','423987','','',''),('6837','sonam singh','vinod singh','11-Mar-2024','FEMALE','sonamsingh04453@gmail.com','7985541115','UMNARRIED','1408 narayanpuri naubasta kanpur','kanpur','uttar pradesh','208021'),('5897','yt','','','FEMALE','','','other','','','',''),('2805','bksrr','wtw','26-Mar-2024','FEMALE','tdyhrtg','356767567','UMNARRIED','yhjkrtfghrdtyh','zdfsae','rtw3','789'),('4589','sonam singh ','vinod singh','12-Aug-1998','FEMALE','sonamsingh04553@gmail.com','7985541115','UMNARRIED','1408 narayanpuri naubasta  kanpur','kanpur nagar','uttar pradesh ','208021'),('1155','sonam singh','vinod singh','12-Aug-1998','FEMALE','sonamsingh0113@gmail.com','7985541115','UMNARRIED','1408 narayanpuri naubasta kanpur','kanpur nagar','uttar pradesh','208021'),('7447','shristi singh ','vinod singh','20-May-2004','FEMALE','sonamsingh04553@gmail.com','7985541115','UMNARRIED','1408 narayanpuri naubasta kanpur','kanpur nagar','uttar pradesh ','208021'),('3849','gchygj','','','FEMALE','','','other','','','','');
/*!40000 ALTER TABLE `signup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `signupthree`
--

DROP TABLE IF EXISTS `signupthree`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `signupthree` (
  `formno` varchar(20) DEFAULT NULL,
  `accountType` varchar(40) DEFAULT NULL,
  `cardNumber` varchar(25) DEFAULT NULL,
  `pin` varchar(10) DEFAULT NULL,
  `facility` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `signupthree`
--

LOCK TABLES `signupthree` WRITE;
/*!40000 ALTER TABLE `signupthree` DISABLE KEYS */;
INSERT INTO `signupthree` VALUES ('','Reccuring Deposite Account','147783895040936000000000','2260','ATM Card'),('','Reccuring Deposite Account','705876775040936000000000','7044','ATM Card'),('','Fixed Deposite Account','676067615040936000000000','8671','ATM Card'),('2805','Fixed Deposite Account','69372515040936000000000','2095','ATM Card'),('4589','Saving Account','363408495040936000000000','6891','ATM Card'),('1155','Saving Account','116218385040936000000000','489','Mobile Banking'),('7447','Saving Account','447284755040936000000000','2165','ATM Card');
/*!40000 ALTER TABLE `signupthree` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `signuptwo`
--

DROP TABLE IF EXISTS `signuptwo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `signuptwo` (
  `formno` varchar(20) DEFAULT NULL,
  `religion` mediumtext,
  `category` mediumtext,
  `income` mediumtext,
  `education` mediumtext,
  `occupation` mediumtext,
  `senior_citizen` varchar(20) DEFAULT NULL,
  `pan_card` varchar(20) DEFAULT NULL,
  `adhar_card` varchar(20) DEFAULT NULL,
  `existing_account` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `signuptwo`
--

LOCK TABLES `signuptwo` WRITE;
/*!40000 ALTER TABLE `signuptwo` DISABLE KEYS */;
INSERT INTO `signuptwo` VALUES ('','javax.swing.JComboBox[,300,140,400x30,layout=javax.swing.plaf.metal.MetalComboBoxUI$MetalComboBoxLayoutManager,alignmentX=0.0,alignmentY=0.0,border=,flags=328,maximumSize=,minimumSize=,preferredSize=,isEditable=false,lightWeightPopupEnabled=true,maximumRowCount=8,selectedItemReminder=Hindu]','javax.swing.JComboBox[,300,200,400x30,layout=javax.swing.plaf.metal.MetalComboBoxUI$MetalComboBoxLayoutManager,alignmentX=0.0,alignmentY=0.0,border=,flags=328,maximumSize=,minimumSize=,preferredSize=,isEditable=false,lightWeightPopupEnabled=true,maximumRowCount=8,selectedItemReminder=General]','javax.swing.JComboBox[,300,260,400x30,layout=javax.swing.plaf.metal.MetalComboBoxUI$MetalComboBoxLayoutManager,alignmentX=0.0,alignmentY=0.0,border=,flags=328,maximumSize=,minimumSize=,preferredSize=,isEditable=false,lightWeightPopupEnabled=true,maximumRowCount=8,selectedItemReminder=1-150000]','javax.swing.JComboBox[,300,320,400x30,layout=javax.swing.plaf.metal.MetalComboBoxUI$MetalComboBoxLayoutManager,alignmentX=0.0,alignmentY=0.0,border=,flags=328,maximumSize=,minimumSize=,preferredSize=,isEditable=false,lightWeightPopupEnabled=true,maximumRowCount=8,selectedItemReminder=Under Graduate]','javax.swing.JComboBox[,300,380,400x30,layout=javax.swing.plaf.metal.MetalComboBoxUI$MetalComboBoxLayoutManager,alignmentX=0.0,alignmentY=0.0,border=,flags=328,maximumSize=,minimumSize=,preferredSize=,isEditable=false,lightWeightPopupEnabled=true,maximumRowCount=8,selectedItemReminder=business]','NO','dfcnoiq','qwdiqw','NO'),('','javax.swing.JComboBox[,300,140,400x30,layout=javax.swing.plaf.metal.MetalComboBoxUI$MetalComboBoxLayoutManager,alignmentX=0.0,alignmentY=0.0,border=,flags=328,maximumSize=,minimumSize=,preferredSize=,isEditable=false,lightWeightPopupEnabled=true,maximumRowCount=8,selectedItemReminder=Muslim]','javax.swing.JComboBox[,300,200,400x30,layout=javax.swing.plaf.metal.MetalComboBoxUI$MetalComboBoxLayoutManager,alignmentX=0.0,alignmentY=0.0,border=,flags=328,maximumSize=,minimumSize=,preferredSize=,isEditable=false,lightWeightPopupEnabled=true,maximumRowCount=8,selectedItemReminder=Sc]','javax.swing.JComboBox[,300,260,400x30,layout=javax.swing.plaf.metal.MetalComboBoxUI$MetalComboBoxLayoutManager,alignmentX=0.0,alignmentY=0.0,border=,flags=328,maximumSize=,minimumSize=,preferredSize=,isEditable=false,lightWeightPopupEnabled=true,maximumRowCount=8,selectedItemReminder=<250000]','javax.swing.JComboBox[,300,320,400x30,layout=javax.swing.plaf.metal.MetalComboBoxUI$MetalComboBoxLayoutManager,alignmentX=0.0,alignmentY=0.0,border=,flags=328,maximumSize=,minimumSize=,preferredSize=,isEditable=false,lightWeightPopupEnabled=true,maximumRowCount=8,selectedItemReminder=Graduate]','javax.swing.JComboBox[,300,380,400x30,layout=javax.swing.plaf.metal.MetalComboBoxUI$MetalComboBoxLayoutManager,alignmentX=0.0,alignmentY=0.0,border=,flags=328,maximumSize=,minimumSize=,preferredSize=,isEditable=false,lightWeightPopupEnabled=true,maximumRowCount=8,selectedItemReminder=Student]','NO','46753245','564524','NO'),('','Hindu','General','1-150000','Under Graduate','business','NO','','hgbikj','NO'),('','Hindu','General','1-150000','Under Graduate','business','NO','','89uj9','NO'),('6837','Hindu','General','1-150000','Pst Graduate','Student','YES','lj57e392','590208945473','YES'),('5897','Hindu','General','1-150000','Under Graduate','business','NO','','468u','NO'),('2805','Hindu','General','1-150000','Under Graduate','business','NO','hjkut','dtyhjrtuj','NO'),('4589','Hindu','General','1-150000','Pst Graduate','Student','NO','lj100034545','590208945473','NO'),('1155','Hindu','General','1-150000','Under Graduate','business','NO','ljo13902343','590208945473','NO'),('7447','Hindu','General','1-150000','Under Graduate','business','NO','LJSO698564','590208945473','NO'),('3849','Hindu','General','1-150000','Under Graduate','business','NO','','5868','NO');
/*!40000 ALTER TABLE `signuptwo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'bankmanagementsystem'
--

--
-- Dumping routines for database 'bankmanagementsystem'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-08-15 10:07:43
