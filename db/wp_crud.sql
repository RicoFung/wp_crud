-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: wp_crud
-- ------------------------------------------------------
-- Server version	5.5.58-0ubuntu0.14.04.1

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
-- Table structure for table `tb_demo`
--

DROP TABLE IF EXISTS `tb_demo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_demo` (
  `tc_rowid` int(11) NOT NULL AUTO_INCREMENT,
  `tc_pic` varchar(200) DEFAULT NULL,
  `tc_name` varchar(45) DEFAULT NULL,
  `tc_price` double DEFAULT NULL,
  `tc_date` datetime DEFAULT NULL,
  PRIMARY KEY (`tc_rowid`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_demo`
--

LOCK TABLES `tb_demo` WRITE;
/*!40000 ALTER TABLE `tb_demo` DISABLE KEYS */;
INSERT INTO `tb_demo` VALUES (1,'http://mz.djmall.xmisp.cn/files/product/20161201/148058328876.jpg','日本资生堂洗颜',230,'2018-01-01 00:00:00'),(2,'http://mz.djmall.xmisp.cn/files/product/20161201/148058301941.jpg','倩碧焕妍活力精华露',330,'2018-01-02 00:00:00'),(3,'http://mz.djmall.xmisp.cn/files/product/20161201/14805828016.jpg','特效润肤露',430,'2018-01-03 00:00:00'),(4,'http://mz.djmall.xmisp.cn/files/product/20161201/148058228431.jpg','倩碧水嫩保湿精华面霜',530,'2018-01-04 00:00:00'),(5,'http://mz.djmall.xmisp.cn/files/product/20161201/148057953326.jpg','兰蔻清莹柔肤爽肤水',630,'2018-01-05 00:00:00'),(6,'http://mz.djmall.xmisp.cn/files/product/20161201/148057921620_middle.jpg','LANCOME兰蔻小黑瓶精华',230,'2018-01-06 00:00:00'),(7,'http://mz.djmall.xmisp.cn/files/product/20161201/148058328876.jpg','日本资生堂洗颜',230,'2018-01-01 00:00:00'),(8,'http://mz.djmall.xmisp.cn/files/product/20161201/148058301941.jpg','倩碧焕妍活力精华露',330,'2018-01-02 00:00:00'),(9,'http://mz.djmall.xmisp.cn/files/product/20161201/14805828016.jpg','特效润肤露',430,'2018-01-03 00:00:00'),(10,'http://mz.djmall.xmisp.cn/files/product/20161201/148058228431.jpg','倩碧水嫩保湿精华面霜',530,'2018-01-04 00:00:00'),(11,'http://mz.djmall.xmisp.cn/files/product/20161201/148057953326.jpg','兰蔻清莹柔肤爽肤水',630,'2018-01-05 00:00:00'),(12,'http://mz.djmall.xmisp.cn/files/product/20161201/148057921620_middle.jpg','LANCOME兰蔻小黑瓶精华',230,'2018-01-06 00:00:00'),(13,'http://mz.djmall.xmisp.cn/files/product/20161201/148058328876.jpg','日本资生堂洗颜',230,'2018-01-01 00:00:00'),(14,'http://mz.djmall.xmisp.cn/files/product/20161201/148058301941.jpg','倩碧焕妍活力精华露',330,'2018-01-02 00:00:00'),(15,'http://mz.djmall.xmisp.cn/files/product/20161201/14805828016.jpg','特效润肤露',430,'2018-01-03 00:00:00'),(16,'http://mz.djmall.xmisp.cn/files/product/20161201/148058228431.jpg','倩碧水嫩保湿精华面霜',530,'2018-01-04 00:00:00'),(17,'http://mz.djmall.xmisp.cn/files/product/20161201/148057953326.jpg','兰蔻清莹柔肤爽肤水',630,'2018-01-05 00:00:00'),(18,'http://mz.djmall.xmisp.cn/files/product/20161201/148057921620_middle.jpg','LANCOME兰蔻小黑瓶精华',230,'2018-01-06 00:00:00');
/*!40000 ALTER TABLE `tb_demo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-02-26 11:33:06
