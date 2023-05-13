-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: springboot02xk1
-- ------------------------------------------------------
-- Server version	8.0.23

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `config` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','upload/picture1.jpg'),(2,'picture2','upload/picture2.jpg'),(3,'picture3','upload/picture3.jpg');
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gonggaoban`
--

DROP TABLE IF EXISTS `gonggaoban`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `gonggaoban` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) DEFAULT NULL COMMENT '标题',
  `neirong` longtext COMMENT '内容',
  `faburiqi` date DEFAULT NULL COMMENT '发布日期',
  `jinglizhanghao` varchar(200) DEFAULT NULL COMMENT '经理账号',
  `jinglixingming` varchar(200) DEFAULT NULL COMMENT '经理姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=89 DEFAULT CHARSET=utf8 COMMENT='公告板';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gonggaoban`
--

LOCK TABLES `gonggaoban` WRITE;
/*!40000 ALTER TABLE `gonggaoban` DISABLE KEYS */;
INSERT INTO `gonggaoban` VALUES (81,'2023-05-11 11:59:31','标题1','内容1','2023-05-11','经理账号1','经理姓名1'),(82,'2023-05-11 11:59:31','标题2','内容2','2023-05-11','经理账号2','经理姓名2'),(83,'2023-05-11 11:59:31','标题3','内容3','2023-05-11','经理账号3','经理姓名3'),(84,'2023-05-11 11:59:31','标题4','内容4','2023-05-11','经理账号4','经理姓名4'),(85,'2023-05-11 11:59:31','标题5','内容5','2023-05-11','经理账号5','经理姓名5'),(86,'2023-05-11 11:59:31','标题6','内容6','2023-05-11','经理账号6','经理姓名6'),(87,'2023-05-11 11:59:31','标题7','内容7','2023-05-11','经理账号7','经理姓名7'),(88,'2023-05-11 11:59:31','标题8','内容8','2023-05-11','经理账号8','经理姓名8');
/*!40000 ALTER TABLE `gonggaoban` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `liuyanban`
--

DROP TABLE IF EXISTS `liuyanban`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `liuyanban` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) DEFAULT NULL COMMENT '标题',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `liuyanshijian` date DEFAULT NULL COMMENT '留言时间',
  `liuyanneirong` longtext COMMENT '留言内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=99 DEFAULT CHARSET=utf8 COMMENT='留言板';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `liuyanban`
--

LOCK TABLES `liuyanban` WRITE;
/*!40000 ALTER TABLE `liuyanban` DISABLE KEYS */;
INSERT INTO `liuyanban` VALUES (91,'2023-05-11 11:59:31','标题1','账号1','姓名1','2023-05-11','留言内容1'),(92,'2023-05-11 11:59:31','标题2','账号2','姓名2','2023-05-11','留言内容2'),(93,'2023-05-11 11:59:31','标题3','账号3','姓名3','2023-05-11','留言内容3'),(94,'2023-05-11 11:59:31','标题4','账号4','姓名4','2023-05-11','留言内容4'),(95,'2023-05-11 11:59:31','标题5','账号5','姓名5','2023-05-11','留言内容5'),(96,'2023-05-11 11:59:31','标题6','账号6','姓名6','2023-05-11','留言内容6'),(97,'2023-05-11 11:59:31','标题7','账号7','姓名7','2023-05-11','留言内容7'),(98,'2023-05-11 11:59:31','标题8','账号8','姓名8','2023-05-11','留言内容8');
/*!40000 ALTER TABLE `liuyanban` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `token` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,21,'经理账号1','xiangmujingli','项目经理','ccl1l3hz5p6iat6qbcqg3l8af25s251h','2023-05-11 12:01:03','2023-05-11 13:01:03'),(2,1,'admin','users','管理员','lsfgrnzc99f9rtsmcv9qymnn3r1zoehv','2023-05-13 06:19:08','2023-05-13 09:07:40');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'admin','admin','管理员','2023-05-11 11:59:31');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xiangmufenlei`
--

DROP TABLE IF EXISTS `xiangmufenlei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `xiangmufenlei` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xiangmufenlei` varchar(200) NOT NULL COMMENT '项目分类',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8 COMMENT='项目分类';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xiangmufenlei`
--

LOCK TABLES `xiangmufenlei` WRITE;
/*!40000 ALTER TABLE `xiangmufenlei` DISABLE KEYS */;
INSERT INTO `xiangmufenlei` VALUES (31,'2023-05-11 11:59:31','项目分类1'),(32,'2023-05-11 11:59:31','项目分类2'),(33,'2023-05-11 11:59:31','项目分类3'),(34,'2023-05-11 11:59:31','项目分类4'),(35,'2023-05-11 11:59:31','项目分类5'),(36,'2023-05-11 11:59:31','项目分类6'),(37,'2023-05-11 11:59:31','项目分类7'),(38,'2023-05-11 11:59:31','项目分类8');
/*!40000 ALTER TABLE `xiangmufenlei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xiangmufenpei`
--

DROP TABLE IF EXISTS `xiangmufenpei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `xiangmufenpei` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `fenpeibianhao` varchar(200) DEFAULT NULL COMMENT '分配编号',
  `xiangmumingcheng` varchar(200) DEFAULT NULL COMMENT '项目名称',
  `xiangmufenlei` varchar(200) DEFAULT NULL COMMENT '项目分类',
  `youxianji` varchar(200) DEFAULT NULL COMMENT '优先级',
  `jiezhiriqi` date DEFAULT NULL COMMENT '截止日期',
  `fenpeishijian` date DEFAULT NULL COMMENT '分配时间',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `zhiwei` varchar(200) DEFAULT NULL COMMENT '职位',
  `fenpeineirong` longtext COMMENT '分配内容',
  `jinglizhanghao` varchar(200) DEFAULT NULL COMMENT '经理账号',
  `jinglixingming` varchar(200) DEFAULT NULL COMMENT '经理姓名',
  PRIMARY KEY (`id`),
  UNIQUE KEY `fenpeibianhao` (`fenpeibianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=utf8 COMMENT='项目分配';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xiangmufenpei`
--

LOCK TABLES `xiangmufenpei` WRITE;
/*!40000 ALTER TABLE `xiangmufenpei` DISABLE KEYS */;
INSERT INTO `xiangmufenpei` VALUES (51,'2023-05-11 11:59:31','1111111111','项目名称1','项目分类1','一般重要关键','2023-05-11','2023-05-11','账号1','姓名1','职位1','分配内容1','经理账号1','经理姓名1'),(52,'2023-05-11 11:59:31','2222222222','项目名称2','项目分类2','一般重要关键','2023-05-11','2023-05-11','账号2','姓名2','职位2','分配内容2','经理账号2','经理姓名2'),(53,'2023-05-11 11:59:31','3333333333','项目名称3','项目分类3','一般重要关键','2023-05-11','2023-05-11','账号3','姓名3','职位3','分配内容3','经理账号3','经理姓名3'),(54,'2023-05-11 11:59:31','4444444444','项目名称4','项目分类4','一般重要关键','2023-05-11','2023-05-11','账号4','姓名4','职位4','分配内容4','经理账号4','经理姓名4'),(55,'2023-05-11 11:59:31','5555555555','项目名称5','项目分类5','一般重要关键','2023-05-11','2023-05-11','账号5','姓名5','职位5','分配内容5','经理账号5','经理姓名5'),(56,'2023-05-11 11:59:31','6666666666','项目名称6','项目分类6','一般重要关键','2023-05-11','2023-05-11','账号6','姓名6','职位6','分配内容6','经理账号6','经理姓名6'),(57,'2023-05-11 11:59:31','7777777777','项目名称7','项目分类7','一般重要关键','2023-05-11','2023-05-11','账号7','姓名7','职位7','分配内容7','经理账号7','经理姓名7'),(58,'2023-05-11 11:59:31','8888888888','项目名称8','项目分类8','一般重要关键','2023-05-11','2023-05-11','账号8','姓名8','职位8','分配内容8','经理账号8','经理姓名8');
/*!40000 ALTER TABLE `xiangmufenpei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xiangmujindu`
--

DROP TABLE IF EXISTS `xiangmujindu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `xiangmujindu` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xiangmumingcheng` varchar(200) DEFAULT NULL COMMENT '项目名称',
  `xiangmufenlei` varchar(200) DEFAULT NULL COMMENT '项目分类',
  `xiangmujindu` varchar(200) DEFAULT NULL COMMENT '项目进度',
  `tourushijian` int DEFAULT NULL COMMENT '投入时间',
  `chengbenjine` float DEFAULT NULL COMMENT '成本金额',
  `shengyutianshu` int DEFAULT NULL COMMENT '剩余天数',
  `yuqimubiao` varchar(200) DEFAULT NULL COMMENT '预期目标',
  `jinzhanqingkuang` longtext COMMENT '进展情况',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `jinglizhanghao` varchar(200) DEFAULT NULL COMMENT '经理账号',
  `jinglixingming` varchar(200) DEFAULT NULL COMMENT '经理姓名',
  `progress` float DEFAULT NULL COMMENT '进度值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=69 DEFAULT CHARSET=utf8 COMMENT='项目进度';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xiangmujindu`
--

LOCK TABLES `xiangmujindu` WRITE;
/*!40000 ALTER TABLE `xiangmujindu` DISABLE KEYS */;
INSERT INTO `xiangmujindu` VALUES (61,'2023-05-11 11:59:31','项目名称1','项目分类1','进行中',1,1,1,'预期目标1','进展情况1','账号1','姓名1','经理账号1','经理姓名1',0.1),(62,'2023-05-11 11:59:31','项目名称2','项目分类2','进行中',2,2,2,'预期目标2','进展情况2','账号2','姓名2','经理账号2','经理姓名2',0.2),(63,'2023-05-11 11:59:31','项目名称3','项目分类3','进行中',3,3,3,'预期目标3','进展情况3','账号3','姓名3','经理账号3','经理姓名3',0.3),(64,'2023-05-11 11:59:31','项目名称4','项目分类4','进行中',4,4,4,'预期目标4','进展情况4','账号4','姓名4','经理账号4','经理姓名4',0.4),(65,'2023-05-11 11:59:31','项目名称5','项目分类5','进行中',5,5,5,'预期目标5','进展情况5','账号5','姓名5','经理账号5','经理姓名5',0.5),(66,'2023-05-11 11:59:31','项目名称6','项目分类6','进行中',6,6,6,'预期目标6','进展情况6','账号6','姓名6','经理账号6','经理姓名6',0.6),(67,'2023-05-11 11:59:31','项目名称7','项目分类7','进行中',7,7,7,'预期目标7','进展情况7','账号7','姓名7','经理账号7','经理姓名7',0.7),(68,'2023-05-11 11:59:31','项目名称8','项目分类8','进行中',8,8,8,'预期目标8','进展情况8','账号8','姓名8','经理账号8','经理姓名8',0.8);
/*!40000 ALTER TABLE `xiangmujindu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xiangmujingli`
--

DROP TABLE IF EXISTS `xiangmujingli`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `xiangmujingli` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jinglizhanghao` varchar(200) NOT NULL COMMENT '经理账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `jinglixingming` varchar(200) NOT NULL COMMENT '经理姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `touxiang` longtext COMMENT '头像',
  PRIMARY KEY (`id`),
  UNIQUE KEY `jinglizhanghao` (`jinglizhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8 COMMENT='项目经理';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xiangmujingli`
--

LOCK TABLES `xiangmujingli` WRITE;
/*!40000 ALTER TABLE `xiangmujingli` DISABLE KEYS */;
INSERT INTO `xiangmujingli` VALUES (21,'2023-05-11 11:59:31','经理账号1','123456','经理姓名1','男','13823888881','upload/xiangmujingli_touxiang1.jpg'),(22,'2023-05-11 11:59:31','经理账号2','123456','经理姓名2','男','13823888882','upload/xiangmujingli_touxiang2.jpg'),(23,'2023-05-11 11:59:31','经理账号3','123456','经理姓名3','男','13823888883','upload/xiangmujingli_touxiang3.jpg'),(24,'2023-05-11 11:59:31','经理账号4','123456','经理姓名4','男','13823888884','upload/xiangmujingli_touxiang4.jpg'),(25,'2023-05-11 11:59:31','经理账号5','123456','经理姓名5','男','13823888885','upload/xiangmujingli_touxiang5.jpg'),(26,'2023-05-11 11:59:31','经理账号6','123456','经理姓名6','男','13823888886','upload/xiangmujingli_touxiang6.jpg'),(27,'2023-05-11 11:59:31','经理账号7','123456','经理姓名7','男','13823888887','upload/xiangmujingli_touxiang7.jpg'),(28,'2023-05-11 11:59:31','经理账号8','123456','经理姓名8','男','13823888888','upload/xiangmujingli_touxiang8.jpg');
/*!40000 ALTER TABLE `xiangmujingli` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xiangmutixing`
--

DROP TABLE IF EXISTS `xiangmutixing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `xiangmutixing` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xiangmumingcheng` varchar(200) DEFAULT NULL COMMENT '项目名称',
  `xiangmufenlei` varchar(200) DEFAULT NULL COMMENT '项目分类',
  `tixingshijian` date DEFAULT NULL COMMENT '提醒时间',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `tixingneirong` longtext COMMENT '提醒内容',
  `jinglizhanghao` varchar(200) DEFAULT NULL COMMENT '经理账号',
  `jinglixingming` varchar(200) DEFAULT NULL COMMENT '经理姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=79 DEFAULT CHARSET=utf8 COMMENT='项目提醒';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xiangmutixing`
--

LOCK TABLES `xiangmutixing` WRITE;
/*!40000 ALTER TABLE `xiangmutixing` DISABLE KEYS */;
INSERT INTO `xiangmutixing` VALUES (71,'2023-05-11 11:59:31','项目名称1','项目分类1','2023-05-11','账号1','姓名1','提醒内容1','经理账号1','经理姓名1'),(72,'2023-05-11 11:59:31','项目名称2','项目分类2','2023-05-11','账号2','姓名2','提醒内容2','经理账号2','经理姓名2'),(73,'2023-05-11 11:59:31','项目名称3','项目分类3','2023-05-11','账号3','姓名3','提醒内容3','经理账号3','经理姓名3'),(74,'2023-05-11 11:59:31','项目名称4','项目分类4','2023-05-11','账号4','姓名4','提醒内容4','经理账号4','经理姓名4'),(75,'2023-05-11 11:59:31','项目名称5','项目分类5','2023-05-11','账号5','姓名5','提醒内容5','经理账号5','经理姓名5'),(76,'2023-05-11 11:59:31','项目名称6','项目分类6','2023-05-11','账号6','姓名6','提醒内容6','经理账号6','经理姓名6'),(77,'2023-05-11 11:59:31','项目名称7','项目分类7','2023-05-11','账号7','姓名7','提醒内容7','经理账号7','经理姓名7'),(78,'2023-05-11 11:59:31','项目名称8','项目分类8','2023-05-11','账号8','姓名8','提醒内容8','经理账号8','经理姓名8');
/*!40000 ALTER TABLE `xiangmutixing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xiangmuxinxi`
--

DROP TABLE IF EXISTS `xiangmuxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `xiangmuxinxi` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xiangmubianhao` varchar(200) DEFAULT NULL COMMENT '项目编号',
  `xiangmumingcheng` varchar(200) DEFAULT NULL COMMENT '项目名称',
  `xiangmufenlei` varchar(200) DEFAULT NULL COMMENT '项目分类',
  `xiangmuneirong` longtext COMMENT '项目内容',
  `fabushijian` date DEFAULT NULL COMMENT '发布时间',
  `jinglizhanghao` varchar(200) DEFAULT NULL COMMENT '经理账号',
  `jinglixingming` varchar(200) DEFAULT NULL COMMENT '经理姓名',
  PRIMARY KEY (`id`),
  UNIQUE KEY `xiangmubianhao` (`xiangmubianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8 COMMENT='项目信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xiangmuxinxi`
--

LOCK TABLES `xiangmuxinxi` WRITE;
/*!40000 ALTER TABLE `xiangmuxinxi` DISABLE KEYS */;
INSERT INTO `xiangmuxinxi` VALUES (41,'2023-05-11 11:59:31','1111111111','项目名称1','项目分类1','项目内容1','2023-05-11','经理账号1','经理姓名1'),(42,'2023-05-11 11:59:31','2222222222','项目名称2','项目分类2','项目内容2','2023-05-11','经理账号2','经理姓名2'),(43,'2023-05-11 11:59:31','3333333333','项目名称3','项目分类3','项目内容3','2023-05-11','经理账号3','经理姓名3'),(44,'2023-05-11 11:59:31','4444444444','项目名称4','项目分类4','项目内容4','2023-05-11','经理账号4','经理姓名4'),(45,'2023-05-11 11:59:31','5555555555','项目名称5','项目分类5','项目内容5','2023-05-11','经理账号5','经理姓名5'),(46,'2023-05-11 11:59:31','6666666666','项目名称6','项目分类6','项目内容6','2023-05-11','经理账号6','经理姓名6'),(47,'2023-05-11 11:59:31','7777777777','项目名称7','项目分类7','项目内容7','2023-05-11','经理账号7','经理姓名7'),(48,'2023-05-11 11:59:31','8888888888','项目名称8','项目分类8','项目内容8','2023-05-11','经理账号8','经理姓名8');
/*!40000 ALTER TABLE `xiangmuxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yonghu`
--

DROP TABLE IF EXISTS `yonghu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `yonghu` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) NOT NULL COMMENT '账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) NOT NULL COMMENT '姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `zhiwei` varchar(200) DEFAULT NULL COMMENT '职位',
  `touxiang` longtext COMMENT '头像',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhanghao` (`zhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COMMENT='用户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yonghu`
--

LOCK TABLES `yonghu` WRITE;
/*!40000 ALTER TABLE `yonghu` DISABLE KEYS */;
INSERT INTO `yonghu` VALUES (11,'2023-05-11 11:59:31','账号1','123456','姓名1','男','13823888881','职位1','upload/yonghu_touxiang1.jpg'),(12,'2023-05-11 11:59:31','账号2','123456','姓名2','男','13823888882','职位2','upload/yonghu_touxiang2.jpg'),(13,'2023-05-11 11:59:31','账号3','123456','姓名3','男','13823888883','职位3','upload/yonghu_touxiang3.jpg'),(14,'2023-05-11 11:59:31','账号4','123456','姓名4','男','13823888884','职位4','upload/yonghu_touxiang4.jpg'),(15,'2023-05-11 11:59:31','账号5','123456','姓名5','男','13823888885','职位5','upload/yonghu_touxiang5.jpg'),(16,'2023-05-11 11:59:31','账号6','123456','姓名6','男','13823888886','职位6','upload/yonghu_touxiang6.jpg'),(17,'2023-05-11 11:59:31','账号7','123456','姓名7','男','13823888887','职位7','upload/yonghu_touxiang7.jpg'),(18,'2023-05-11 11:59:31','账号8','123456','姓名8','男','13823888888','职位8','upload/yonghu_touxiang8.jpg');
/*!40000 ALTER TABLE `yonghu` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-05-13 16:43:49
