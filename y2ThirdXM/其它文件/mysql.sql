/*
SQLyog Ultimate
MySQL - 5.7.18-log : Database - y2
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`y2` /*!40100 DEFAULT CHARACTER SET utf8 */;

/*Table structure for table `bumen` */

DROP TABLE IF EXISTS `bumen`;

CREATE TABLE `bumen` (
  `BuMenId` int(8) NOT NULL AUTO_INCREMENT COMMENT '����id',
  `BuMenName` varchar(50) DEFAULT NULL COMMENT '��������',
  `parentId` int(11) DEFAULT NULL COMMENT '���Ÿ���id',
  `bei1` varchar(100) DEFAULT NULL COMMENT '����1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '����2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '����3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '����4',
  PRIMARY KEY (`BuMenId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `bumen` */

insert  into `bumen`(`BuMenId`,`BuMenName`,`parentId`,`bei1`,`bei2`,`bei3`,`bei4`) values 
(1,'�ɸ�',0,'bei1','bei2','bei3','bei4'),
(2,'����',1,'bei1','bei2','bei3','bei4'),
(3,'����',1,'bei1','bei2','bei3','bei4'),
(4,'�ͷ�',1,'bei1','bei2','bei3','bei4'),
(5,'�ۺ�',1,'bei1','bei2','bei3','bei4');

/*Table structure for table `carbaoyang` */

DROP TABLE IF EXISTS `carbaoyang`;

CREATE TABLE `carbaoyang` (
  `ChePai` varchar(20) DEFAULT NULL COMMENT '����',
  `BaoYangName` varchar(50) DEFAULT NULL COMMENT '��������',
  `JiHuankm` int(8) DEFAULT NULL COMMENT '�ƻ����',
  `JiHuanDate` date DEFAULT NULL COMMENT '�ƻ�����',
  `remark` varchar(200) DEFAULT NULL COMMENT '��ע',
  `bei1` varchar(100) DEFAULT NULL COMMENT '����1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '����2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '����3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '����4'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `carbaoyang` */

/*Table structure for table `carbrand` */

DROP TABLE IF EXISTS `carbrand`;

CREATE TABLE `carbrand` (
  `CarBankId` int(8) NOT NULL AUTO_INCREMENT COMMENT '����Ʒ��id',
  `CarBankName` varchar(50) DEFAULT NULL COMMENT '����Ʒ������',
  `firstWord` varchar(10) DEFAULT NULL COMMENT '����ĸ',
  `bei1` varchar(100) DEFAULT NULL COMMENT '����1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '����2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '����3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '����4',
  PRIMARY KEY (`CarBankId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `carbrand` */

/*Table structure for table `carinfo` */

DROP TABLE IF EXISTS `carinfo`;

CREATE TABLE `carinfo` (
  `ChePai` varchar(20) DEFAULT NULL COMMENT '����',
  `XingHao` varchar(20) DEFAULT NULL COMMENT '�����ͺ�',
  `CarBankId` int(8) DEFAULT NULL COMMENT '����Ʒ��id',
  `FaBankId` int(8) DEFAULT NULL COMMENT '������Ʒ��id',
  `JinKou` varchar(50) DEFAULT NULL COMMENT '���ڹ���',
  `CanKaoPrice` double DEFAULT NULL COMMENT '�ο��۸�',
  `YearPrice` double DEFAULT NULL COMMENT '�������',
  `GongLu` varchar(20) DEFAULT NULL COMMENT '����',
  `ZaiZhong` varchar(20) DEFAULT NULL COMMENT '����',
  `RanYou` varchar(20) DEFAULT NULL COMMENT 'ȼ�ͱ��',
  `CheJia` varchar(50) DEFAULT NULL COMMENT '���ܺ�',
  `bei1` varchar(100) DEFAULT NULL COMMENT '����1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '����2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '����3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '����4'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `carinfo` */

/*Table structure for table `carxing` */

DROP TABLE IF EXISTS `carxing`;

CREATE TABLE `carxing` (
  `xingId` int(8) NOT NULL AUTO_INCREMENT COMMENT '����id',
  `CarBankId` int(8) DEFAULT NULL COMMENT '����Ʒ��id����������Ʒ�Ʊ�(carbank)',
  `JinKou` varchar(20) DEFAULT NULL COMMENT '���ڹ���',
  `CanKaoPrice` double DEFAULT NULL COMMENT '�ο��۸�',
  `CarYearMoney` double DEFAULT NULL COMMENT '�������',
  `GongLv` varchar(20) DEFAULT NULL COMMENT '����',
  `ZaiZhong` varchar(20) DEFAULT NULL COMMENT '����',
  `RanYou` varchar(20) DEFAULT NULL COMMENT 'ȼ�ͱ��',
  `FaBankId` int(8) DEFAULT NULL COMMENT '������Ʒ��id',
  `bei1` varchar(100) DEFAULT NULL COMMENT '����1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '����2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '����3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '����4',
  PRIMARY KEY (`xingId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `carxing` */

/*Table structure for table `fadongbrand` */

DROP TABLE IF EXISTS `fadongbrand`;

CREATE TABLE `fadongbrand` (
  `FaBankId` int(8) NOT NULL AUTO_INCREMENT COMMENT '������Ʒ��id',
  `FaName` varchar(50) DEFAULT NULL COMMENT '����������',
  `FaNumber` varchar(50) DEFAULT NULL COMMENT '��������',
  `bei1` varchar(100) DEFAULT NULL COMMENT '����1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '����2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '����3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '����4',
  PRIMARY KEY (`FaBankId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `fadongbrand` */

/*Table structure for table `gangwei` */

DROP TABLE IF EXISTS `gangwei`;

CREATE TABLE `gangwei` (
  `gangweiId` int(8) NOT NULL AUTO_INCREMENT COMMENT '��λid',
  `gangweiname` varchar(50) DEFAULT NULL COMMENT '��λ����',
  `bei1` varchar(100) DEFAULT NULL COMMENT '����1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '����2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '����3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '����4',
  PRIMARY KEY (`gangweiId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `gangwei` */

insert  into `gangwei`(`gangweiId`,`gangweiname`,`bei1`,`bei2`,`bei3`,`bei4`) values 
(1,'CEO','bei1','bei2','bei3','bei4'),
(2,'�ͷ�����','bei1','bei2','bei3','bei4'),
(3,'���񲿾���','bei1','bei2','bei3','bei4'),
(4,'�ۺ�Ա��','bei1','bei2','bei3','bei4');

/*Table structure for table `goods` */

DROP TABLE IF EXISTS `goods`;

CREATE TABLE `goods` (
  `Goodsid` int(8) NOT NULL AUTO_INCREMENT COMMENT '��Ʒid',
  `GoodsName` varchar(20) DEFAULT NULL COMMENT '��Ʒ����',
  `GoodsBank` varchar(20) DEFAULT NULL COMMENT '��ƷƷ��',
  `ShiYong` varchar(20) DEFAULT NULL COMMENT '���ó���',
  `DanWei` varchar(20) DEFAULT NULL COMMENT '��λ',
  `GoodsTypeId` int(8) DEFAULT NULL COMMENT '��Ʒ����id',
  `ShouRuId` int(8) DEFAULT NULL COMMENT '��������id',
  `YuanFuChang` varchar(20) DEFAULT NULL COMMENT 'ԭ������',
  `GoodsGraden` varchar(20) DEFAULT NULL COMMENT '��Ʒ�ȼ�',
  `GoodsAddress` varchar(20) DEFAULT NULL COMMENT '��Ʒ����',
  `HuoShangNo` varchar(20) DEFAULT NULL COMMENT '�����̱���(����)',
  `BaoZhuan` varchar(20) DEFAULT NULL COMMENT '��װ���',
  `TiJi` double DEFAULT NULL COMMENT '���',
  `MaoZhong` double DEFAULT NULL COMMENT 'ë��',
  `JingZhong` double DEFAULT NULL COMMENT '����',
  `JinHuo` varchar(20) DEFAULT NULL COMMENT '������',
  `ShouJia` double DEFAULT NULL COMMENT '�ۼ۰�',
  `JiaJia` varchar(20) DEFAULT NULL COMMENT '�Ӽ���',
  `price` double DEFAULT NULL COMMENT '��ע��',
  `VIPprice` double DEFAULT NULL COMMENT 'vip��',
  `Huiprice` double DEFAULT NULL COMMENT '��Ա��',
  `isTiYong` char(2) DEFAULT NULL COMMENT '�Ƿ�ͣ��',
  `bei1` varchar(100) DEFAULT NULL COMMENT '����1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '����2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '����3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '����4',
  PRIMARY KEY (`Goodsid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `goods` */

/*Table structure for table `goodstype` */

DROP TABLE IF EXISTS `goodstype`;

CREATE TABLE `goodstype` (
  `GoodsTypeid` int(8) NOT NULL AUTO_INCREMENT COMMENT '��Ʒ����id',
  `typeName` varchar(20) DEFAULT NULL COMMENT '��������',
  `parentId` int(8) DEFAULT NULL COMMENT '��������',
  `bei1` varchar(100) DEFAULT NULL COMMENT '����1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '����2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '����3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '����4',
  PRIMARY KEY (`GoodsTypeid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `goodstype` */

/*Table structure for table `huifang` */

DROP TABLE IF EXISTS `huifang`;

CREATE TABLE `huifang` (
  `huifangid` int(6) NOT NULL AUTO_INCREMENT COMMENT '�طñ�id',
  `chepai` varchar(20) DEFAULT NULL COMMENT '�طó�������',
  `hfNeiRon` varchar(50) DEFAULT NULL COMMENT '�ط�����',
  `hfdate` datetime DEFAULT NULL COMMENT '�ط�ʱ��',
  `hfXiaoGuo` varchar(50) DEFAULT NULL COMMENT '�ط�Ч��',
  `no` varchar(20) DEFAULT NULL COMMENT '�طõ���',
  `hfGuWen` varchar(20) DEFAULT NULL COMMENT '�طù���',
  `shuoming` varchar(200) DEFAULT NULL COMMENT '�ط���ϸ˵��',
  `bei1` varchar(100) DEFAULT NULL,
  `bei2` varchar(100) DEFAULT NULL,
  `bei3` varchar(100) DEFAULT NULL,
  `bei4` varchar(100) DEFAULT NULL,
  `bei5` varchar(100) DEFAULT NULL,
  `bei6` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`huifangid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `huifang` */

/*Table structure for table `huiyuan` */

DROP TABLE IF EXISTS `huiyuan`;

CREATE TABLE `huiyuan` (
  `HuiYuanNo` varchar(20) NOT NULL COMMENT '��Ա����',
  `KeHuNo` varchar(20) DEFAULT NULL COMMENT '�ͻ�����',
  `HuiYuanName` varchar(20) DEFAULT NULL COMMENT '��Ա���',
  `HuiYuanMoney` double DEFAULT NULL COMMENT '��Ա���',
  `xiaofei` double DEFAULT NULL COMMENT '���ѽ��',
  `RuHuiTime` datetime DEFAULT NULL COMMENT '���ʱ��',
  `DaoQiTime` datetime DEFAULT NULL COMMENT '����ʱ��',
  `HuiYuanGraden` varchar(20) DEFAULT NULL COMMENT '��Ա�ȼ�',
  `YouHui` varchar(20) DEFAULT NULL COMMENT '�Ż�',
  `JiFen` int(8) DEFAULT NULL COMMENT '����',
  `bei1` varchar(100) DEFAULT NULL COMMENT '����1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '����2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '����3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '����4',
  PRIMARY KEY (`HuiYuanNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `huiyuan` */

/*Table structure for table `huoshang` */

DROP TABLE IF EXISTS `huoshang`;

CREATE TABLE `huoshang` (
  `HuoShangNo` varchar(20) NOT NULL COMMENT '�����̱���',
  `ShangName` varchar(20) DEFAULT NULL COMMENT '����������',
  `address` varchar(50) DEFAULT NULL COMMENT '�����̵�ַ',
  `JingYin` varchar(20) DEFAULT NULL COMMENT '��Ӫ���',
  `WangZhi` varchar(50) DEFAULT NULL COMMENT '��ַ',
  `KaiHu` varchar(50) DEFAULT NULL COMMENT '������',
  `YinHangCard` varchar(50) DEFAULT NULL COMMENT '���п���',
  `GoodsNo` varchar(50) DEFAULT NULL COMMENT '��Ӧ��Ʒ����',
  `FuKuan` varchar(20) DEFAULT NULL COMMENT '���ʽ',
  `ShangGraden` varchar(20) DEFAULT NULL COMMENT '���̵ȼ�',
  `JingYinType` varchar(20) DEFAULT NULL COMMENT '��ӪƷ��',
  `ShangType` varchar(20) DEFAULT NULL COMMENT '�������',
  `LianXi` varchar(11) DEFAULT NULL COMMENT '��ϵ��',
  `DianHua` varchar(11) DEFAULT NULL COMMENT '�绰',
  `ShouJi` varchar(11) DEFAULT NULL COMMENT '�ֻ�',
  `Email` varchar(50) DEFAULT NULL COMMENT 'email',
  `ZhangQi` datetime DEFAULT NULL COMMENT '����',
  `remark` varchar(200) DEFAULT NULL,
  `bei1` varchar(100) DEFAULT NULL COMMENT '����1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '����2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '����3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '����4',
  PRIMARY KEY (`HuoShangNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `huoshang` */

/*Table structure for table `jigong` */

DROP TABLE IF EXISTS `jigong`;

CREATE TABLE `jigong` (
  `JiGongNo` varchar(20) NOT NULL COMMENT '����id',
  `jiGongXing` int(8) DEFAULT NULL COMMENT '�����Ǽ�id',
  `BanId` int(8) DEFAULT NULL COMMENT '��������id',
  `WeiXiuType` varchar(50) DEFAULT NULL COMMENT 'ά�޹���',
  `WeiXiuBank` varchar(50) DEFAULT NULL COMMENT 'ά��Ʒ��',
  `JiGongName` varchar(50) DEFAULT NULL COMMENT '��������',
  `sex` char(2) DEFAULT NULL COMMENT '�Ա�',
  `phone` varchar(11) DEFAULT NULL COMMENT '�ֻ�',
  `login` varchar(20) DEFAULT NULL COMMENT '��½�˺�',
  `address` varchar(50) DEFAULT NULL COMMENT '��ַ',
  `wx` varchar(20) DEFAULT NULL COMMENT '΢��',
  `birthday` date DEFAULT NULL COMMENT '����',
  `idCard` varchar(20) DEFAULT NULL COMMENT '���֤��',
  `HuKouAddress` varchar(100) DEFAULT NULL COMMENT '���ڵ�ַ',
  `Bank` varchar(100) DEFAULT NULL COMMENT '��������',
  `BankCard` varchar(30) DEFAULT NULL COMMENT '���п���',
  `isZuZhang` int(2) DEFAULT '0' COMMENT '�Ƿ��鳤',
  `bei1` varchar(100) DEFAULT NULL COMMENT '����1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '����2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '����3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '����4',
  PRIMARY KEY (`JiGongNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `jigong` */

insert  into `jigong`(`JiGongNo`,`jiGongXing`,`BanId`,`WeiXiuType`,`WeiXiuBank`,`JiGongName`,`sex`,`phone`,`login`,`address`,`wx`,`birthday`,`idCard`,`HuKouAddress`,`Bank`,`BankCard`,`isZuZhang`,`bei1`,`bei2`,`bei3`,`bei4`) values 
('jgbh001',1,1,'��̥','����','�����','��','12345678996','123654','����','12345678996','1991-02-04','365425894122257896','�Ϻ�','��ɳ����','5698524698752365489',1,'bei1','bei2','bei3','bei4'),
('jgbh002',2,2,'����','����','�Ͷ���','Ů','34567976543','243456','����','34567976543','1993-01-03','343434343434343434','�Ϻ�','��ͨ����','1231231231231231231',0,'bei1','bei2','bei3','bei4'),
('jgbh003',3,3,'������','����','��Ŷ��','��','34567543789','767878','�Ͼ�','34567543789','1994-09-04','454545454545454545','�Ϻ�','�й�����','2342342342342342342',0,'bei1','bei2','bei3','bei4'),
('jgbh004',1,4,'��װ','�ղ�','�ƻ�','Ů','12312312311','898989','����','12312312311','1991-09-07','565656565656565656','�Ϻ�','��������','3453453453453453453',0,'bei1','bei2','bei3','bei4');

/*Table structure for table `jigongban` */

DROP TABLE IF EXISTS `jigongban`;

CREATE TABLE `jigongban` (
  `BanId` int(8) NOT NULL AUTO_INCREMENT COMMENT '��������id',
  `BanName` varchar(50) DEFAULT NULL COMMENT '��������',
  `parentId` int(8) DEFAULT NULL COMMENT '�������鸸��id',
  `bei1` varchar(100) DEFAULT NULL COMMENT '����1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '����2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '����3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '����4',
  PRIMARY KEY (`BanId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `jigongban` */

insert  into `jigongban`(`BanId`,`BanName`,`parentId`,`bei1`,`bei2`,`bei3`,`bei4`) values 
(1,'�Խ�',0,'bei1','bei2','bei3','bei4'),
(2,'1��',1,'bei1','bei2','bei3','bei4'),
(3,'2��',1,'bei1','bei2','bei3','bei4'),
(4,'3��',1,'bei1','bei2','bei3','bei4'),
(5,'4��',1,'bei1','bei2','bei3','bei4');

/*Table structure for table `jigongstar` */

DROP TABLE IF EXISTS `jigongstar`;

CREATE TABLE `jigongstar` (
  `JiStarId` int(8) NOT NULL COMMENT '�����Ǽ�id',
  `StarName` varchar(20) DEFAULT NULL COMMENT '�����Ǽ�����',
  `TiCheng` varchar(50) DEFAULT NULL COMMENT '���Ȩ��',
  `bei1` varchar(100) DEFAULT NULL COMMENT '����1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '����2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '����3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '����4',
  PRIMARY KEY (`JiStarId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `jigongstar` */

insert  into `jigongstar`(`JiStarId`,`StarName`,`TiCheng`,`bei1`,`bei2`,`bei3`,`bei4`) values 
(1,'1�Ǽ�','1','bei1','bei2','bei3','bei4'),
(2,'2�Ǽ�','2','bei1','bei2','bei3','bei4'),
(3,'3�Ǽ�','3','bei1','bei2','bei3','bei4');

/*Table structure for table `jiuyuan` */

DROP TABLE IF EXISTS `jiuyuan`;

CREATE TABLE `jiuyuan` (
  `jyDanNo` varchar(20) DEFAULT NULL COMMENT '��Ԯ����',
  `jyChepai` varchar(20) DEFAULT NULL COMMENT '��Ԯ��������',
  `jyGuwen` varchar(50) DEFAULT NULL COMMENT '��Ԯ�������',
  `jyYeWuType` varchar(20) DEFAULT NULL COMMENT '��Ԯҵ�����',
  `jyShiGong` varchar(20) DEFAULT NULL COMMENT '��Ԯʩ�����',
  `nowLicheng` double DEFAULT NULL COMMENT '��ǰ���',
  `Paigongtime` datetime DEFAULT NULL COMMENT '�ɹ�ʱ��',
  `PaigongBanzu` int(6) DEFAULT NULL COMMENT '�ɹ����飨id��',
  `ChuFaTime` datetime DEFAULT NULL COMMENT '����ʱ��',
  `ChuFaAddress` varchar(100) DEFAULT NULL COMMENT '������ַ',
  `JiaShiCar` varchar(20) DEFAULT NULL COMMENT '��ʻ����',
  `jyLiChen` double DEFAULT NULL COMMENT '��Ԯ��ʻ���',
  `jyEndAddress` varchar(100) DEFAULT NULL COMMENT '��Ԯ��ַ',
  `jyEndTime` datetime DEFAULT NULL COMMENT '��Ԯ����ʱ��',
  `WanGongTime` datetime DEFAULT NULL COMMENT '�깤ʱ��',
  `Yugumoney` double DEFAULT NULL COMMENT 'Ԥ�����',
  `tureMoney` double DEFAULT NULL COMMENT 'ʵ�ʽ��',
  `remark` varchar(200) DEFAULT NULL,
  `jyChengShu` varchar(200) DEFAULT NULL COMMENT '��Ԯ����',
  `bei1` varchar(100) DEFAULT NULL,
  `bei2` varchar(100) DEFAULT NULL,
  `bei3` varchar(100) DEFAULT NULL,
  `bei4` varchar(100) DEFAULT NULL,
  `bei5` varchar(100) DEFAULT NULL,
  `bei6` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `jiuyuan` */

/*Table structure for table `jungong` */

DROP TABLE IF EXISTS `jungong`;

CREATE TABLE `jungong` (
  `wxDanNo` varchar(20) DEFAULT NULL COMMENT 'ά�޵���',
  `isHeGe` char(2) DEFAULT NULL COMMENT '�Ƿ�ϸ��깤',
  `YuJiTime` datetime DEFAULT NULL COMMENT 'Ԥ���깤ʱ��',
  `ShiJiTime` datetime DEFAULT NULL COMMENT 'ʵ���깤ʱ��',
  `WuGong` varchar(100) DEFAULT NULL COMMENT '��ԭ��',
  `ZhiJian` varchar(100) DEFAULT NULL COMMENT '�ʼ�',
  `WuGongRen` varchar(100) DEFAULT NULL COMMENT '��������',
  `WuGongChuFa` double DEFAULT NULL COMMENT '�󹤴������',
  `FanGongCi` int(11) DEFAULT NULL COMMENT '��������',
  `FanGong` varchar(100) DEFAULT NULL COMMENT '����ԭ��',
  `FanGongRen` varchar(100) DEFAULT NULL COMMENT '����������',
  `FanGongChuFa` double DEFAULT NULL COMMENT '�����������',
  `bei1` varchar(100) DEFAULT NULL COMMENT '����1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '����2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '����3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '����4'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `jungong` */

/*Table structure for table `kehu` */

DROP TABLE IF EXISTS `kehu`;

CREATE TABLE `kehu` (
  `kehuid` int(11) NOT NULL AUTO_INCREMENT COMMENT '�ͻ�id',
  `KeHuNo` varchar(20) DEFAULT NULL COMMENT '�ͻ�����',
  `KeHuName` varchar(20) DEFAULT NULL COMMENT '�ͻ�����',
  `KeHuAddress` varchar(100) DEFAULT NULL COMMENT '�ͻ���ַ',
  `ZhuAddress` varchar(100) DEFAULT NULL COMMENT 'ע���ַ',
  `KeHuBirthday` date DEFAULT NULL COMMENT '�ͻ�����',
  `KeHuType` varchar(20) DEFAULT NULL COMMENT '�ͻ�����',
  `KeHuLianXi` varchar(100) DEFAULT NULL COMMENT '�ͻ���ϵ��',
  `KeHuPhone` varchar(100) DEFAULT NULL COMMENT '�ͻ��绰',
  `ZhangQi` datetime DEFAULT NULL COMMENT '����',
  `GuaZhang` double DEFAULT NULL COMMENT '����',
  `eDu` double DEFAULT NULL COMMENT '���',
  `DinJin` double DEFAULT NULL COMMENT '�������',
  `GuWen` varchar(20) DEFAULT NULL COMMENT 'ר������',
  `GuWenPhone` varchar(11) DEFAULT NULL COMMENT '���ʵ绰',
  `ChePai` varchar(20) DEFAULT NULL COMMENT '���ƺ���',
  `remark` varchar(200) DEFAULT NULL COMMENT '��ע',
  `JiFen` int(8) DEFAULT NULL COMMENT '����',
  `ZhuPhone` varchar(11) DEFAULT NULL COMMENT 'ע��绰',
  `bank` varchar(50) DEFAULT NULL COMMENT '��������',
  `bankcard` varchar(20) DEFAULT NULL COMMENT '���п���',
  `bei1` varchar(100) DEFAULT NULL COMMENT '����1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '����2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '����3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '����4',
  PRIMARY KEY (`kehuid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `kehu` */

insert  into `kehu`(`kehuid`,`KeHuNo`,`KeHuName`,`KeHuAddress`,`ZhuAddress`,`KeHuBirthday`,`KeHuType`,`KeHuLianXi`,`KeHuPhone`,`ZhangQi`,`GuaZhang`,`eDu`,`DinJin`,`GuWen`,`GuWenPhone`,`ChePai`,`remark`,`JiFen`,`ZhuPhone`,`bank`,`bankcard`,`bei1`,`bei2`,`bei3`,`bei4`) values 
(1,'111111','��ͨ�������������޹�˾','����·126��',NULL,'2020-01-21','һ��ͻ�','��ͨ�������������޹�˾','13117331859','0000-00-00 00:00:00',0,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `kehucar` */

DROP TABLE IF EXISTS `kehucar`;

CREATE TABLE `kehucar` (
  `ChePai` varchar(20) NOT NULL COMMENT '����',
  `KeHuNo` varchar(20) DEFAULT NULL COMMENT '����������ͻ���kehuid',
  `CarBankId` int(8) DEFAULT NULL COMMENT '����Ʒ��id',
  `XingHao` varchar(20) DEFAULT NULL COMMENT '�����ͺ�',
  `SiJiName` varchar(20) DEFAULT NULL COMMENT '˾������',
  `SiJiPhone` varchar(11) DEFAULT NULL COMMENT '˾���绰',
  `SiJiBirthday` date DEFAULT NULL COMMENT '˾������',
  `GuiShu` varchar(20) DEFAULT NULL COMMENT '��������',
  `JiaZhao` datetime DEFAULT NULL COMMENT '���յ���',
  `CheJia` varchar(20) DEFAULT NULL COMMENT '���ܺ�',
  `FaBankId` int(8) DEFAULT NULL COMMENT '������Ʒ��id',
  `NianKuan` double DEFAULT NULL COMMENT '�������',
  `LiCheng` int(8) DEFAULT NULL COMMENT '���',
  `ZaiZhong` int(8) DEFAULT NULL COMMENT '����',
  `GouMaiDate` date DEFAULT NULL COMMENT '��������',
  `ShanPaiDate` date DEFAULT NULL COMMENT '��������',
  `CheJian` date DEFAULT NULL COMMENT '���쵽��',
  `RanYou` varchar(20) DEFAULT NULL COMMENT 'ȼ�����',
  `CheXi` varchar(50) DEFAULT NULL COMMENT '��ϵ',
  `nextBaoXian` int(8) DEFAULT NULL COMMENT '�´α������',
  `nextBaoXianDate` date DEFAULT NULL COMMENT '�´α�������',
  `bei1` varchar(100) DEFAULT NULL COMMENT '����1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '����2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '����3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '����4',
  PRIMARY KEY (`ChePai`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `kehucar` */

insert  into `kehucar`(`ChePai`,`KeHuNo`,`CarBankId`,`XingHao`,`SiJiName`,`SiJiPhone`,`SiJiBirthday`,`GuiShu`,`JiaZhao`,`CheJia`,`FaBankId`,`NianKuan`,`LiCheng`,`ZaiZhong`,`GouMaiDate`,`ShanPaiDate`,`CheJian`,`RanYou`,`CheXi`,`nextBaoXian`,`nextBaoXianDate`,`bei1`,`bei2`,`bei3`,`bei4`) values 
('��D705C8','1',NULL,'�����ǵ¿�','����ɸ�','17783905571','1979-10-24',NULL,'2020-01-21 20:45:35',NULL,NULL,NULL,200000,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `kehuxiaofei` */

DROP TABLE IF EXISTS `kehuxiaofei`;

CREATE TABLE `kehuxiaofei` (
  `xiaoid` int(8) NOT NULL AUTO_INCREMENT COMMENT '�ͻ�����id',
  `dantype` varchar(20) DEFAULT NULL COMMENT '��������',
  `xsdanhao` varchar(20) DEFAULT NULL COMMENT '���۵���',
  `chepai` varchar(20) DEFAULT NULL COMMENT '����',
  `wxyewu` varchar(20) DEFAULT NULL COMMENT 'ά��ҵ��',
  `jincdate` date DEFAULT NULL COMMENT '����ʱ��',
  `overdate` date DEFAULT NULL COMMENT '�깤ʱ��',
  `jiesdate` date DEFAULT NULL COMMENT '����ʱ��',
  `price` double DEFAULT NULL COMMENT '���ѽ��',
  `KeHuNo` varchar(20) DEFAULT NULL COMMENT '�ͻ���ţ����',
  `bei1` varchar(100) DEFAULT NULL COMMENT '����1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '����2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '����3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '����4',
  PRIMARY KEY (`xiaoid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `kehuxiaofei` */

/*Table structure for table `lingliao` */

DROP TABLE IF EXISTS `lingliao`;

CREATE TABLE `lingliao` (
  `llid` int(6) NOT NULL AUTO_INCREMENT COMMENT '���ϱ�id',
  `wxDanNo` varchar(20) DEFAULT NULL COMMENT 'ά�޵���',
  `lldate` datetime DEFAULT NULL COMMENT '��������',
  `llperple` varchar(20) DEFAULT NULL COMMENT '������',
  `wuLiaoid` int(6) DEFAULT NULL COMMENT '����id',
  `number` int(6) DEFAULT NULL COMMENT '����',
  `fuwuguwen` varchar(20) DEFAULT NULL COMMENT '�������',
  `bei1` varchar(100) DEFAULT NULL COMMENT '����1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '����2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '����3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '����4',
  `bei5` varchar(100) DEFAULT NULL COMMENT '����5',
  `bei6` varchar(100) DEFAULT NULL COMMENT '����6',
  PRIMARY KEY (`llid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `lingliao` */

/*Table structure for table `lizhi` */

DROP TABLE IF EXISTS `lizhi`;

CREATE TABLE `lizhi` (
  `YuanNo` varchar(20) DEFAULT NULL COMMENT 'Ա�����',
  `LiZhiTime` datetime DEFAULT NULL COMMENT '��ְʱ��',
  `remark` varchar(200) DEFAULT NULL COMMENT '��ְԭ��',
  `bei1` varchar(100) DEFAULT NULL COMMENT '����1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '����2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '����3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '����4'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `lizhi` */

insert  into `lizhi`(`YuanNo`,`LiZhiTime`,`remark`,`bei1`,`bei2`,`bei3`,`bei4`) values 
('ygbh001','2020-11-03 00:00:00','�������','bei1','bei2','bei3','bei4');

/*Table structure for table `permissions` */

DROP TABLE IF EXISTS `permissions`;

CREATE TABLE `permissions` (
  `pid` int(8) NOT NULL AUTO_INCREMENT COMMENT 'Ȩ�ޱ��',
  `pname` varchar(50) DEFAULT NULL COMMENT 'Ȩ����������',
  `penglishname` varchar(50) DEFAULT NULL COMMENT 'Ȩ��Ӣ������',
  `catalog` int(3) DEFAULT NULL COMMENT 'Ŀ¼/����',
  `parentid` int(8) DEFAULT NULL COMMENT 'Ȩ�޸������',
  `path` varchar(100) DEFAULT NULL COMMENT '·��',
  `bei1` varchar(100) DEFAULT NULL COMMENT '����1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '����2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '����3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '����4',
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

/*Data for the table `permissions` */

insert  into `permissions`(`pid`,`pname`,`penglishname`,`catalog`,`parentid`,`path`,`bei1`,`bei2`,`bei3`,`bei4`) values 
(1,'ά�޾�Ԯ','jiuyuan',0,10,NULL,NULL,NULL,NULL,NULL),
(2,'ά�޽ӳ�','jieche',1,1,NULL,NULL,NULL,NULL,NULL),
(3,'��������','jianyan',1,1,NULL,NULL,NULL,NULL,NULL),
(4,'�ͻ�����','dangan',0,11,NULL,NULL,NULL,NULL,NULL),
(5,'�ͻ�����','kehu',1,4,NULL,NULL,NULL,NULL,NULL),
(6,'��������','chelian',1,4,NULL,NULL,NULL,NULL,NULL),
(7,'������','shuju',0,12,NULL,NULL,NULL,NULL,NULL),
(8,'������Ʒ��','pinpai',1,7,NULL,NULL,NULL,NULL,NULL),
(9,'ǰ̨','qiantai',0,0,NULL,NULL,NULL,NULL,NULL),
(10,'ά��','weixiu',0,0,NULL,NULL,NULL,NULL,NULL),
(11,'�ͷ�','kefu',0,0,NULL,NULL,NULL,NULL,NULL),
(12,'����','shujul',0,0,NULL,NULL,NULL,NULL,NULL),
(13,'����','renshi',0,0,NULL,NULL,NULL,NULL,NULL),
(14,'ϵͳ','xitong',0,0,NULL,NULL,NULL,NULL,NULL),
(15,'ά����Ŀ','xiangmu',1,7,NULL,NULL,NULL,NULL,NULL),
(16,'��Ʒ����','goods',1,7,NULL,NULL,NULL,NULL,NULL),
(17,'������λ','gonghuo',1,7,NULL,NULL,NULL,NULL,NULL),
(18,'Ա������','yuangong',0,13,NULL,NULL,NULL,NULL,NULL),
(19,'��֯�ṹ','zuzhi',1,18,NULL,NULL,NULL,NULL,NULL),
(20,'��λ����','gangwei',1,18,NULL,NULL,NULL,NULL,NULL),
(21,'��������','jigong',0,13,NULL,NULL,NULL,NULL,NULL),
(22,'�����Ǽ�','xinji',1,21,NULL,NULL,NULL,NULL,NULL),
(23,'���鼼��','banzu',1,21,NULL,NULL,NULL,NULL,NULL),
(24,'���ڳ���','waiqin',1,21,NULL,NULL,NULL,NULL,NULL),
(25,'Ȩ�޿���','kozhi',0,14,NULL,NULL,NULL,NULL,NULL),
(26,'��ɫȨ�޿���','juese',1,25,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `pinzhi` */

DROP TABLE IF EXISTS `pinzhi`;

CREATE TABLE `pinzhi` (
  `PinZhiId` int(8) DEFAULT NULL COMMENT '��Ƹְ��id����Ӧְ���',
  `number` int(4) DEFAULT NULL COMMENT '��Ƹ��Ա����',
  `requeir` varchar(100) DEFAULT NULL COMMENT '��ƸҪ��',
  `ender` datetime DEFAULT NULL COMMENT '��ֹʱ��',
  `bei1` varchar(100) DEFAULT NULL COMMENT '����1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '����2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '����3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '����4'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `pinzhi` */

/*Table structure for table `quanxian` */

DROP TABLE IF EXISTS `quanxian`;

CREATE TABLE `quanxian` (
  `QuanXianId` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Ȩ��id',
  `QuanXianName` varchar(50) DEFAULT NULL COMMENT 'Ȩ����',
  `url` varchar(100) DEFAULT NULL COMMENT '·��',
  `remark` varchar(200) DEFAULT NULL,
  `bei1` varchar(100) DEFAULT NULL COMMENT '����1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '����2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '����3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '����4',
  PRIMARY KEY (`QuanXianId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `quanxian` */

/*Table structure for table `roles_perms` */

DROP TABLE IF EXISTS `roles_perms`;

CREATE TABLE `roles_perms` (
  `rolesid` int(8) NOT NULL AUTO_INCREMENT COMMENT '��ɫ/Ȩ��id',
  `pid` int(8) DEFAULT NULL,
  `zid` int(8) DEFAULT NULL,
  PRIMARY KEY (`rolesid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `roles_perms` */

insert  into `roles_perms`(`rolesid`,`pid`,`zid`) values 
(1,1,1),
(2,2,1),
(3,3,1),
(4,4,1),
(5,5,1),
(6,6,1);

/*Table structure for table `ruzhi` */

DROP TABLE IF EXISTS `ruzhi`;

CREATE TABLE `ruzhi` (
  `YuanNo` varchar(20) DEFAULT NULL COMMENT 'Ա��id',
  `RuZhiTime` datetime DEFAULT NULL COMMENT '��ְʱ��',
  `bei1` varchar(100) DEFAULT NULL COMMENT '����1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '����2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '����3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '����4'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `ruzhi` */

insert  into `ruzhi`(`YuanNo`,`RuZhiTime`,`bei1`,`bei2`,`bei3`,`bei4`) values 
('1','2014-08-09 00:00:00','bei1','bei2','bei3','bei4'),
('2','2010-02-10 00:00:00','bei1','bei2','bei3','bei4'),
('3','2009-07-19 00:00:00','bei1','bei2','bei3','bei4'),
('4','2004-03-09 00:00:00','bei1','bei2','bei3','bei4');

/*Table structure for table `sale` */

DROP TABLE IF EXISTS `sale`;

CREATE TABLE `sale` (
  `SaleNo` varchar(50) NOT NULL COMMENT '���۵���',
  `SaleType` varchar(50) DEFAULT NULL COMMENT '��������',
  `GoodsId` int(8) DEFAULT NULL COMMENT '��Ʒid',
  `GoodsNumber` int(8) DEFAULT NULL COMMENT '��Ʒ����',
  `SaleTime` datetime DEFAULT NULL COMMENT '����ʱ��',
  `KaiDan` varchar(50) DEFAULT NULL COMMENT '������',
  `KeHuNo` varchar(20) DEFAULT NULL COMMENT '�ͻ����',
  `JieSuan` varchar(50) DEFAULT NULL COMMENT '������',
  `HuiYuanNo` varchar(50) DEFAULT NULL COMMENT '��Ա����',
  `JieSuanType` varchar(50) DEFAULT NULL COMMENT '���㷽ʽ',
  `JieSuanTime` datetime DEFAULT NULL COMMENT '����ʱ��',
  `money` double DEFAULT NULL COMMENT '���',
  `YouHui` varchar(50) DEFAULT NULL COMMENT '�Ż�',
  `YouHuiType` varchar(50) DEFAULT NULL COMMENT '�Ż�����',
  `bei1` varchar(100) DEFAULT NULL COMMENT '����1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '����2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '����3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '����4',
  PRIMARY KEY (`SaleNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sale` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `userid` int(8) NOT NULL AUTO_INCREMENT,
  `loginName` varchar(20) DEFAULT NULL COMMENT '��½�˺�',
  `password` varchar(20) DEFAULT NULL COMMENT '����',
  `yuanNo` varchar(20) DEFAULT NULL COMMENT 'Ա�����',
  `bei1` varchar(100) DEFAULT NULL COMMENT '����1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '����2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '����3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '����4',
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

/*Table structure for table `waiqingcar` */

DROP TABLE IF EXISTS `waiqingcar`;

CREATE TABLE `waiqingcar` (
  `ChePai` varchar(10) NOT NULL COMMENT '���ƺ���',
  `CarBank` varchar(20) DEFAULT NULL COMMENT '����Ʒ��',
  `CheXing` varchar(50) DEFAULT NULL COMMENT '����',
  `NowLi` varchar(10) DEFAULT NULL COMMENT '��ǰ���',
  `BanId` int(8) DEFAULT NULL COMMENT '������������id',
  `bei1` varchar(100) DEFAULT NULL COMMENT '����1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '����2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '����3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '����4',
  PRIMARY KEY (`ChePai`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `waiqingcar` */

/*Table structure for table `wxjiedan` */

DROP TABLE IF EXISTS `wxjiedan`;

CREATE TABLE `wxjiedan` (
  `wxDanNo` varchar(20) NOT NULL COMMENT 'ά�޵���',
  `wxDanType` varchar(20) DEFAULT NULL COMMENT 'ά�޵�������',
  `wxType` varchar(20) DEFAULT NULL COMMENT 'ά������',
  `DanJuStatu` varchar(20) DEFAULT NULL COMMENT '����״̬',
  `Kaidantime` datetime DEFAULT NULL COMMENT '����ʱ��',
  `KeHunNo` varchar(20) DEFAULT NULL COMMENT '�ͻ����',
  `ChePai` varchar(20) DEFAULT NULL COMMENT '���ƺ���',
  `CarBankId` int(8) DEFAULT NULL COMMENT '����Ʒ��id',
  `CarXingHao` varchar(50) DEFAULT NULL COMMENT '�����ͺ�',
  `CheJiaXingHao` varchar(50) DEFAULT NULL COMMENT '�����ͺ�',
  `FaNumber` varchar(50) DEFAULT NULL COMMENT '��������',
  `FaBankId` int(8) DEFAULT NULL COMMENT '������Ʒ��id',
  `GuWen` varchar(20) DEFAULT NULL COMMENT '�������',
  `CheZhu` varchar(20) DEFAULT NULL COMMENT '��������',
  `SiJiName` varchar(20) DEFAULT NULL COMMENT '˾������',
  `LianPhone` varchar(20) DEFAULT NULL COMMENT '��ϵ�绰',
  `JinChanLi` int(20) DEFAULT NULL COMMENT '�������',
  `JinChanYou` int(20) DEFAULT NULL COMMENT '��������',
  `prevLi` int(20) DEFAULT NULL COMMENT '�ϴ����',
  `prevTime` datetime DEFAULT NULL COMMENT '�ϴν���',
  `JinChanTime` datetime DEFAULT NULL COMMENT '����ʱ��',
  `YeWuType` varchar(20) DEFAULT NULL COMMENT 'ҵ�����',
  `ShiGong` varchar(20) DEFAULT NULL COMMENT 'ʩ�����',
  `JieChe` varchar(20) DEFAULT NULL COMMENT '�ӳ���',
  `YuJiTime` datetime DEFAULT NULL COMMENT 'Ԥ���깤ʱ��',
  `WanGongTime` datetime DEFAULT NULL COMMENT '�깤ʱ��',
  `JieSuanType` varchar(20) DEFAULT NULL COMMENT '���㷽ʽ',
  `jieSuantime` datetime DEFAULT NULL COMMENT '����ʱ��',
  `jieSuanmoney` double DEFAULT NULL COMMENT '������',
  `PeiKuan` varchar(20) DEFAULT NULL COMMENT '��˾',
  `Money` double DEFAULT NULL COMMENT 'Ԥ��������������Ҫ�������',
  `saleNo` varchar(20) DEFAULT NULL COMMENT '�������ۺ�',
  `BaoXiu` varchar(20) DEFAULT NULL COMMENT '���޳���',
  `remark` varchar(200) DEFAULT NULL COMMENT '��ע',
  `bei1` varchar(100) DEFAULT NULL COMMENT '����1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '����2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '����3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '����4',
  PRIMARY KEY (`wxDanNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `wxjiedan` */

/*Table structure for table `wxshouru` */

DROP TABLE IF EXISTS `wxshouru`;

CREATE TABLE `wxshouru` (
  `ShouRuId` int(8) NOT NULL AUTO_INCREMENT COMMENT '��������id',
  `ShouRuType` varchar(50) DEFAULT NULL COMMENT '������������',
  `bei1` varchar(100) DEFAULT NULL COMMENT '����1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '����2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '����3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '����4',
  PRIMARY KEY (`ShouRuId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `wxshouru` */

/*Table structure for table `wxxiangmu` */

DROP TABLE IF EXISTS `wxxiangmu`;

CREATE TABLE `wxxiangmu` (
  `XiangMuNo` varchar(50) NOT NULL COMMENT '��Ŀ����',
  `XiangMuName` varchar(100) DEFAULT NULL COMMENT '��Ŀ����',
  `XingMuType` varchar(100) DEFAULT NULL COMMENT '��Ŀ����',
  `ShouJiaAn` varchar(20) DEFAULT NULL COMMENT '�ۼ۰�',
  `ShouRuid` int(8) DEFAULT NULL COMMENT '��������id',
  `price` double DEFAULT NULL COMMENT '��׼��',
  `VIPprice` double DEFAULT NULL COMMENT 'vip��',
  `huiPrice` double DEFAULT NULL COMMENT '��Ա��',
  `xiePrice` double DEFAULT NULL COMMENT 'Э���',
  `bei1` varchar(100) DEFAULT NULL COMMENT '����1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '����2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '����3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '����4',
  PRIMARY KEY (`XiangMuNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `wxxiangmu` */

/*Table structure for table `yuangong` */

DROP TABLE IF EXISTS `yuangong`;

CREATE TABLE `yuangong` (
  `yuanNo` varchar(20) NOT NULL COMMENT 'Ա�����',
  `shuXingId` int(8) DEFAULT NULL COMMENT '����id',
  `BuMenId` int(8) DEFAULT NULL COMMENT '��������id',
  `yuanName` varchar(20) DEFAULT NULL COMMENT 'Ա������',
  `birthday` date DEFAULT NULL COMMENT '��������',
  `sex` char(2) DEFAULT NULL COMMENT '�Ա�',
  `phone` varchar(15) DEFAULT NULL COMMENT '��ϵ�绰',
  `emPeople` varchar(20) DEFAULT NULL COMMENT '������ϵ��',
  `emPhone` varchar(11) DEFAULT NULL COMMENT '������ϵ�˵绰',
  `ZhiWuId` varchar(8) DEFAULT NULL COMMENT 'ְ��id',
  `nowAddress` varchar(50) DEFAULT NULL COMMENT '��ס��ַ',
  `HuAddress` varchar(50) DEFAULT NULL COMMENT '���ڵ�ַ',
  `bank` varchar(50) DEFAULT NULL COMMENT '��������',
  `cardNumber` varchar(25) DEFAULT NULL COMMENT '�����ʺ�',
  `email` varchar(30) DEFAULT NULL COMMENT '����',
  `bodystate` varchar(20) DEFAULT NULL COMMENT '����״��',
  `height` int(4) DEFAULT NULL COMMENT '���',
  `JiGuan` varchar(100) DEFAULT NULL COMMENT '����',
  `MinZu` varchar(10) DEFAULT NULL COMMENT '����',
  `HunYin` varchar(10) DEFAULT NULL COMMENT '����״��',
  `XueLi` varchar(20) DEFAULT NULL COMMENT 'ѧ��',
  `BiYe` varchar(50) DEFAULT NULL COMMENT '��ҵѧУ',
  `ZhuanYe` varchar(20) DEFAULT NULL COMMENT 'רҵ',
  `ZhuanYezg` varchar(50) DEFAULT NULL COMMENT 'רҵ�ʸ�',
  `xueWei` varchar(50) DEFAULT NULL COMMENT 'ѧλ',
  `bianZhi` varchar(50) DEFAULT NULL COMMENT '����',
  `IDcard` varchar(20) DEFAULT NULL COMMENT '���֤����',
  `shouJi` varchar(11) DEFAULT NULL COMMENT '�ֻ�',
  `ShiYong` date DEFAULT NULL COMMENT '���õ���',
  `HeTongstart` date DEFAULT NULL COMMENT '��ͬ��ʼ����',
  `HeTongEnd` date DEFAULT NULL COMMENT '��ͬ��������',
  `KaZi` varchar(20) DEFAULT NULL COMMENT '���Ա��',
  `KaNei` varchar(20) DEFAULT NULL COMMENT '���ڲ���',
  `TuiJian` varchar(20) DEFAULT NULL COMMENT '�Ƽ���',
  `zdZheKou` double DEFAULT NULL COMMENT '�����ۿ�Ȩ',
  `gsZheKou` double DEFAULT NULL COMMENT '��ʱ�ۿ�Ȩ',
  `spZheKou` double DEFAULT NULL COMMENT '��Ʒ�ۿ�Ȩ',
  `jianMian` double DEFAULT NULL COMMENT '����Ȩ',
  `fenqi` varchar(20) DEFAULT NULL COMMENT '���ڶ̺�',
  `sflz` int(8) DEFAULT NULL COMMENT '�Ƿ���ְ1��ʾ�Ѿ���ְ0��ʾû����ְ',
  `gangweId` int(8) DEFAULT NULL COMMENT '��λid',
  `login` varchar(20) DEFAULT NULL COMMENT '��½�˺�',
  `bei1` varchar(100) DEFAULT NULL COMMENT '����1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '����2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '����3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '����4',
  PRIMARY KEY (`yuanNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `yuangong` */

insert  into `yuangong`(`yuanNo`,`shuXingId`,`BuMenId`,`yuanName`,`birthday`,`sex`,`phone`,`emPeople`,`emPhone`,`ZhiWuId`,`nowAddress`,`HuAddress`,`bank`,`cardNumber`,`email`,`bodystate`,`height`,`JiGuan`,`MinZu`,`HunYin`,`XueLi`,`BiYe`,`ZhuanYe`,`ZhuanYezg`,`xueWei`,`bianZhi`,`IDcard`,`shouJi`,`ShiYong`,`HeTongstart`,`HeTongEnd`,`KaZi`,`KaNei`,`TuiJian`,`zdZheKou`,`gsZheKou`,`spZheKou`,`jianMian`,`fenqi`,`sflz`,`gangweId`,`login`,`bei1`,`bei2`,`bei3`,`bei4`) values 
('ygbh001',1,1,'������','1997-09-27','��','18974159998','���','13754893247','0','����','����','��ɳ����','3587459854124785478','1837638100@qq.com','����',168,'����','��','δ��','�ߵȽ���','�廪��ѧ','��������','�߼�����ʦ','��ʿ','��ʽԱ��','430223845951236578','18974159998','2014-08-09','2014-08-10','3014-08-10','123456','123456','����',80,70,60,50,'28598547',0,1,'123676','bei1','bei2','bei3','bei4'),
('ygbh002',2,2,'��˹��','1994-09-07','Ů','18958749512','������','13789645721','0','�㶫','����','��ͨ����','3587567854123987564','1895874951@qq.com','����',188,'�㶫','��','�ѻ�','�еȽ���','������ѧ','���繤��','�м�����ʦ','˶ʿ','����ʽԱ��','430223896547521458','13789645721','2010-02-10','2010-02-11','3010-02-11','654321','654321','����',70,60,50,40,'56886468',0,2,'765345','bei1','bei2','bei3','bei4'),
('ygbh003',3,3,'�ҵ���','1993-01-17','��','13754896548','ħ��ʦ','15484135151','0','����','����','�й�����','3587458683393948687','2584668468@qq.com','������',138,'����','׳','δ��','���Ƚ���','������ѧ','��������','��������ʦ','����','��ʽԱ��','963258741365475632','36954751811','2009-07-19','2009-07-20','3009-07-21','969866','969866','ζ��',60,50,40,30,'67868689',0,3,'234765','bei1','bei2','bei3','bei4'),
('ygbh004',4,4,'���ά','1987-10-27','Ů','12312412423','������','35464657757','0','�Ϻ�','�麣','��������','1353523534634634646','3234234234@qq.com','����',211,'�Ϻ�','��','�ѻ�','�ߵȽ���','�廪��ѧ','��������','�߼�����ʦ','��ʿ','��ʽԱ��','124345646456756757','23446789455','2004-03-09','2004-03-19','3004-03-19','324234','324234','�ҵ�',0,0,0,0,'23213567',1,4,'789678','bei1','bei2','bei3','bei4');

/*Table structure for table `yuangongshu` */

DROP TABLE IF EXISTS `yuangongshu`;

CREATE TABLE `yuangongshu` (
  `shuXingId` int(8) NOT NULL AUTO_INCREMENT COMMENT 'Ա������id',
  `shuXingName` varchar(50) DEFAULT NULL COMMENT 'Ա����������',
  `bei1` varchar(100) DEFAULT NULL COMMENT '����1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '����2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '����3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '����4',
  PRIMARY KEY (`shuXingId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `yuangongshu` */

insert  into `yuangongshu`(`shuXingId`,`shuXingName`,`bei1`,`bei2`,`bei3`,`bei4`) values 
(1,'�ƿ��ڼ�н','bei1','bei2','bei3','bei4'),
(2,'�����ڼ�н','bei1','bei2','bei3','bei4'),
(3,'�ƿ��ڲ���н','bei1','bei2','bei3','bei4'),
(4,'�����ڲ���н','bei1','bei2','bei3','bei4');

/*Table structure for table `zhiwu` */

DROP TABLE IF EXISTS `zhiwu`;

CREATE TABLE `zhiwu` (
  `ZhiWuId` varchar(20) NOT NULL COMMENT 'ְ��id',
  `zhiWuName` varchar(50) DEFAULT NULL COMMENT 'ְ������',
  `GongZi` double DEFAULT NULL COMMENT '����',
  `bei1` varchar(100) DEFAULT NULL COMMENT '����1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '����2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '����3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '����4',
  PRIMARY KEY (`ZhiWuId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `zhiwu` */

insert  into `zhiwu`(`ZhiWuId`,`zhiWuName`,`GongZi`,`bei1`,`bei2`,`bei3`,`bei4`) values 
('1','�ܾ���',30000,NULL,NULL,NULL,NULL),
('10','���',10000,NULL,NULL,NULL,NULL),
('11','���',5000,NULL,NULL,NULL,NULL),
('2','վ��',20000,NULL,NULL,NULL,NULL),
('3','������',10000,NULL,NULL,NULL,NULL),
('4','�����ܼ�',10000,NULL,NULL,NULL,NULL),
('5','��������',10000,NULL,NULL,NULL,NULL),
('6','�������',10000,NULL,NULL,NULL,NULL),
('7','�������',10000,NULL,NULL,NULL,NULL),
('8','���Ա',10000,NULL,NULL,NULL,NULL),
('9','����Ա',10000,NULL,NULL,NULL,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
