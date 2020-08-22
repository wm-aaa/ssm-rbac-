/*
SQLyog Ultimate v12.5.0 (64 bit)
MySQL - 8.0.19 : Database - rbac
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`rbac` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `rbac`;

/*Table structure for table `department` */

DROP TABLE IF EXISTS `department`;

CREATE TABLE `department` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `sn` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Data for the table `department` */

insert  into `department`(`id`,`name`,`sn`) values 
(2,'人力资源部','Human Resources Departmen'),
(3,'采购部','Order Department'),
(4,'仓储部','Warehousing Department'),
(5,'财务部','Finance Department'),
(11,'王五','2555');

/*Table structure for table `employee` */

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `age` int DEFAULT NULL,
  `admin` bit(1) DEFAULT NULL,
  `dept_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;

/*Data for the table `employee` */

insert  into `employee`(`id`,`name`,`password`,`email`,`age`,`admin`,`dept_id`) values 
(1,'admin','1','admin@abc.com',21,'\0',2),
(2,'赵总','1','zhaoz@wolfcode.cn',35,'\0',2),
(3,'赵一明','c4ca4238a0b923820dcc509a6f75849b','zhaoym@wolfcode.cn',25,'\0',2),
(4,'钱总','c4ca4238a0b923820dcc509a6f75849b','qianz@wolfcode.cn',35,'\0',2),
(5,'钱二明',NULL,'qianem@wolfcode.cn',25,'',2),
(6,'孙总','c4ca4238a0b923820dcc509a6f75849b','sunz@wolfcode.cn',35,'\0',2),
(7,'孙三明','c4ca4238a0b923820dcc509a6f75849b','sunsm@wolfcode.cn',25,'\0',3),
(8,'李总','c4ca4238a0b923820dcc509a6f75849b','liz@wolfcode.cn',35,'\0',4),
(9,'李四明','c4ca4238a0b923820dcc509a6f75849b','lism@wolfcode.cn',25,'\0',4),
(10,'周总','c4ca4238a0b923820dcc509a6f75849b','zhouz@wolfcode.cn',35,'\0',5),
(11,'周五明','c4ca4238a0b923820dcc509a6f75849b','zhouwm@wolfcode.cn',25,'\0',5),
(12,'吴总','c4ca4238a0b923820dcc509a6f75849b','wuz@wolfcode.cn',35,'\0',6),
(13,'吴六明','c4ca4238a0b923820dcc509a6f75849b','wulm@wolfcode.cn',25,'\0',6),
(14,'郑总','c4ca4238a0b923820dcc509a6f75849b','zhengz@wolfcode.cn',35,'\0',7),
(15,'郑七明','c4ca4238a0b923820dcc509a6f75849b','zhengqm@wolfcode.cn',25,'\0',7),
(16,'孙四明','c4ca4238a0b923820dcc509a6f75849b','sunsim@wolfcode.cn',25,'\0',2),
(25,'wm',NULL,'842891679@qq.com',22,'',2);

/*Table structure for table `employee_role` */

DROP TABLE IF EXISTS `employee_role`;

CREATE TABLE `employee_role` (
  `employee_id` bigint DEFAULT NULL,
  `role_id` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `employee_role` */

insert  into `employee_role`(`employee_id`,`role_id`) values 
(2,1),
(3,12),
(5,11),
(22,11),
(22,12),
(23,3),
(23,4),
(23,11),
(23,12),
(25,1),
(25,2),
(25,1),
(5,11),
(1,2),
(1,3),
(1,13),
(1,14),
(26,2),
(26,1),
(26,3),
(27,2),
(27,4),
(16,2);

/*Table structure for table `permission` */

DROP TABLE IF EXISTS `permission`;

CREATE TABLE `permission` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `expression` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

/*Data for the table `permission` */

insert  into `permission`(`id`,`name`,`expression`) values 
(1,'部门删除','department:delete'),
(2,'部门列表','department:list'),
(3,'部门编辑','department:input'),
(4,'部门保存或更新','department:saveOrUpdate'),
(5,'员工删除','employee:delete'),
(6,'员工列表','employee:list'),
(7,'员工编辑','employee:input'),
(8,'员工保存或更新','employee:saveOrUpdate'),
(9,'权限列表','permission:list'),
(10,'权限加载','permission:reload'),
(11,'角色删除','role:delete'),
(12,'角色列表','role:list'),
(13,'角色编辑','role:input'),
(16,'角色保存或更新','role:saveOrUpdate');

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `sn` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

/*Data for the table `role` */

insert  into `role`(`id`,`name`,`sn`) values 
(1,'人事管理','HR_MGR'),
(2,'采购管理','ORDER_MGR'),
(3,'仓储管理','WAREHOUSING_MGR'),
(4,'行政部管理','Admin_MGR'),
(11,'市场经理','Market_Manager'),
(12,'市场专员','Market'),
(13,'2222222','22222222'),
(14,'1','1'),
(15,'2','2'),
(16,'3333','3'),
(17,'6','7'),
(19,'编辑角色','2555');

/*Table structure for table `role_permission` */

DROP TABLE IF EXISTS `role_permission`;

CREATE TABLE `role_permission` (
  `role_id` bigint DEFAULT NULL,
  `permission_id` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `role_permission` */

insert  into `role_permission`(`role_id`,`permission_id`) values 
(17,1),
(17,3),
(17,5),
(17,6),
(17,7),
(1,2),
(1,3),
(1,4),
(18,6),
(19,13),
(20,12);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
