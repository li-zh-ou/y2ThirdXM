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
  `BuMenId` int(8) NOT NULL AUTO_INCREMENT COMMENT '部门id',
  `BuMenName` varchar(50) DEFAULT NULL COMMENT '部门名称',
  `parentId` int(11) DEFAULT NULL COMMENT '部门父级id',
  `bei1` varchar(100) DEFAULT NULL COMMENT '备用1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '备用2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '备用3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '备用4',
  PRIMARY KEY (`BuMenId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `bumen` */

insert  into `bumen`(`BuMenId`,`BuMenName`,`parentId`,`bei1`,`bei2`,`bei3`,`bei4`) values 
(1,'成高',0,'bei1','bei2','bei3','bei4'),
(2,'财务',1,'bei1','bei2','bei3','bei4'),
(3,'人事',1,'bei1','bei2','bei3','bei4'),
(4,'客服',1,'bei1','bei2','bei3','bei4'),
(5,'售后',1,'bei1','bei2','bei3','bei4');

/*Table structure for table `carbaoyang` */

DROP TABLE IF EXISTS `carbaoyang`;

CREATE TABLE `carbaoyang` (
  `ChePai` varchar(20) DEFAULT NULL COMMENT '车牌',
  `BaoYangName` varchar(50) DEFAULT NULL COMMENT '保养名称',
  `JiHuankm` int(8) DEFAULT NULL COMMENT '计划里程',
  `JiHuanDate` date DEFAULT NULL COMMENT '计划日期',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  `bei1` varchar(100) DEFAULT NULL COMMENT '备用1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '备用2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '备用3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '备用4'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `carbaoyang` */

/*Table structure for table `carbrand` */

DROP TABLE IF EXISTS `carbrand`;

CREATE TABLE `carbrand` (
  `CarBankId` int(8) NOT NULL AUTO_INCREMENT COMMENT '汽车品牌id',
  `CarBankName` varchar(50) DEFAULT NULL COMMENT '汽车品牌名称',
  `firstWord` varchar(10) DEFAULT NULL COMMENT '首字母',
  `bei1` varchar(100) DEFAULT NULL COMMENT '备用1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '备用2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '备用3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '备用4',
  PRIMARY KEY (`CarBankId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `carbrand` */

/*Table structure for table `carinfo` */

DROP TABLE IF EXISTS `carinfo`;

CREATE TABLE `carinfo` (
  `ChePai` varchar(20) DEFAULT NULL COMMENT '车牌',
  `XingHao` varchar(20) DEFAULT NULL COMMENT '车辆型号',
  `CarBankId` int(8) DEFAULT NULL COMMENT '汽车品牌id',
  `FaBankId` int(8) DEFAULT NULL COMMENT '发动机品牌id',
  `JinKou` varchar(50) DEFAULT NULL COMMENT '进口国产',
  `CanKaoPrice` double DEFAULT NULL COMMENT '参考价格',
  `YearPrice` double DEFAULT NULL COMMENT '车辆年款',
  `GongLu` varchar(20) DEFAULT NULL COMMENT '功率',
  `ZaiZhong` varchar(20) DEFAULT NULL COMMENT '载重',
  `RanYou` varchar(20) DEFAULT NULL COMMENT '燃油编号',
  `CheJia` varchar(50) DEFAULT NULL COMMENT '车架号',
  `bei1` varchar(100) DEFAULT NULL COMMENT '备用1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '备用2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '备用3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '备用4'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `carinfo` */

/*Table structure for table `carxing` */

DROP TABLE IF EXISTS `carxing`;

CREATE TABLE `carxing` (
  `xingId` int(8) NOT NULL AUTO_INCREMENT COMMENT '车型id',
  `CarBankId` int(8) DEFAULT NULL COMMENT '车辆品牌id，关联汽车品牌表(carbank)',
  `JinKou` varchar(20) DEFAULT NULL COMMENT '进口国产',
  `CanKaoPrice` double DEFAULT NULL COMMENT '参考价格',
  `CarYearMoney` double DEFAULT NULL COMMENT '车辆年款',
  `GongLv` varchar(20) DEFAULT NULL COMMENT '功率',
  `ZaiZhong` varchar(20) DEFAULT NULL COMMENT '载重',
  `RanYou` varchar(20) DEFAULT NULL COMMENT '燃油编号',
  `FaBankId` int(8) DEFAULT NULL COMMENT '发动机品牌id',
  `bei1` varchar(100) DEFAULT NULL COMMENT '备用1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '备用2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '备用3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '备用4',
  PRIMARY KEY (`xingId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `carxing` */

/*Table structure for table `fadongbrand` */

DROP TABLE IF EXISTS `fadongbrand`;

CREATE TABLE `fadongbrand` (
  `FaBankId` int(8) NOT NULL AUTO_INCREMENT COMMENT '发动机品牌id',
  `FaName` varchar(50) DEFAULT NULL COMMENT '发动机名称',
  `FaNumber` varchar(50) DEFAULT NULL COMMENT '发动机号',
  `bei1` varchar(100) DEFAULT NULL COMMENT '备用1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '备用2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '备用3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '备用4',
  PRIMARY KEY (`FaBankId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `fadongbrand` */

/*Table structure for table `gangwei` */

DROP TABLE IF EXISTS `gangwei`;

CREATE TABLE `gangwei` (
  `gangweiId` int(8) NOT NULL AUTO_INCREMENT COMMENT '岗位id',
  `gangweiname` varchar(50) DEFAULT NULL COMMENT '岗位名称',
  `bei1` varchar(100) DEFAULT NULL COMMENT '备用1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '备用2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '备用3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '备用4',
  PRIMARY KEY (`gangweiId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `gangwei` */

insert  into `gangwei`(`gangweiId`,`gangweiname`,`bei1`,`bei2`,`bei3`,`bei4`) values 
(1,'CEO','bei1','bei2','bei3','bei4'),
(2,'客服经理','bei1','bei2','bei3','bei4'),
(3,'财务部经理','bei1','bei2','bei3','bei4'),
(4,'售后员工','bei1','bei2','bei3','bei4');

/*Table structure for table `goods` */

DROP TABLE IF EXISTS `goods`;

CREATE TABLE `goods` (
  `Goodsid` int(8) NOT NULL AUTO_INCREMENT COMMENT '商品id',
  `GoodsName` varchar(20) DEFAULT NULL COMMENT '商品名称',
  `GoodsBank` varchar(20) DEFAULT NULL COMMENT '商品品牌',
  `ShiYong` varchar(20) DEFAULT NULL COMMENT '适用车型',
  `DanWei` varchar(20) DEFAULT NULL COMMENT '单位',
  `GoodsTypeId` int(8) DEFAULT NULL COMMENT '商品种类id',
  `ShouRuId` int(8) DEFAULT NULL COMMENT '收入种类id',
  `YuanFuChang` varchar(20) DEFAULT NULL COMMENT '原厂副厂',
  `GoodsGraden` varchar(20) DEFAULT NULL COMMENT '商品等级',
  `GoodsAddress` varchar(20) DEFAULT NULL COMMENT '商品产地',
  `HuoShangNo` varchar(20) DEFAULT NULL COMMENT '供货商编码(厂商)',
  `BaoZhuan` varchar(20) DEFAULT NULL COMMENT '包装规格',
  `TiJi` double DEFAULT NULL COMMENT '体积',
  `MaoZhong` double DEFAULT NULL COMMENT '毛重',
  `JingZhong` double DEFAULT NULL COMMENT '净重',
  `JinHuo` varchar(20) DEFAULT NULL COMMENT '进货价',
  `ShouJia` double DEFAULT NULL COMMENT '售价按',
  `JiaJia` varchar(20) DEFAULT NULL COMMENT '加价率',
  `price` double DEFAULT NULL COMMENT '标注价',
  `VIPprice` double DEFAULT NULL COMMENT 'vip价',
  `Huiprice` double DEFAULT NULL COMMENT '会员价',
  `isTiYong` char(2) DEFAULT NULL COMMENT '是否停用',
  `bei1` varchar(100) DEFAULT NULL COMMENT '备用1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '备用2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '备用3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '备用4',
  PRIMARY KEY (`Goodsid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `goods` */

/*Table structure for table `goodstype` */

DROP TABLE IF EXISTS `goodstype`;

CREATE TABLE `goodstype` (
  `GoodsTypeid` int(8) NOT NULL AUTO_INCREMENT COMMENT '商品种类id',
  `typeName` varchar(20) DEFAULT NULL COMMENT '种类名称',
  `parentId` int(8) DEFAULT NULL COMMENT '归属父类',
  `bei1` varchar(100) DEFAULT NULL COMMENT '备用1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '备用2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '备用3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '备用4',
  PRIMARY KEY (`GoodsTypeid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `goodstype` */

/*Table structure for table `huifang` */

DROP TABLE IF EXISTS `huifang`;

CREATE TABLE `huifang` (
  `huifangid` int(6) NOT NULL AUTO_INCREMENT COMMENT '回访表id',
  `chepai` varchar(20) DEFAULT NULL COMMENT '回访车辆车牌',
  `hfNeiRon` varchar(50) DEFAULT NULL COMMENT '回访内容',
  `hfdate` datetime DEFAULT NULL COMMENT '回访时间',
  `hfXiaoGuo` varchar(50) DEFAULT NULL COMMENT '回访效果',
  `no` varchar(20) DEFAULT NULL COMMENT '回访单号',
  `hfGuWen` varchar(20) DEFAULT NULL COMMENT '回访顾问',
  `shuoming` varchar(200) DEFAULT NULL COMMENT '回访详细说明',
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
  `HuiYuanNo` varchar(20) NOT NULL COMMENT '会员卡号',
  `KeHuNo` varchar(20) DEFAULT NULL COMMENT '客户编码',
  `HuiYuanName` varchar(20) DEFAULT NULL COMMENT '会员编号',
  `HuiYuanMoney` double DEFAULT NULL COMMENT '会员余额',
  `xiaofei` double DEFAULT NULL COMMENT '消费金额',
  `RuHuiTime` datetime DEFAULT NULL COMMENT '入会时间',
  `DaoQiTime` datetime DEFAULT NULL COMMENT '到期时间',
  `HuiYuanGraden` varchar(20) DEFAULT NULL COMMENT '会员等级',
  `YouHui` varchar(20) DEFAULT NULL COMMENT '优惠',
  `JiFen` int(8) DEFAULT NULL COMMENT '积分',
  `bei1` varchar(100) DEFAULT NULL COMMENT '备用1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '备用2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '备用3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '备用4',
  PRIMARY KEY (`HuiYuanNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `huiyuan` */

/*Table structure for table `huoshang` */

DROP TABLE IF EXISTS `huoshang`;

CREATE TABLE `huoshang` (
  `HuoShangNo` varchar(20) NOT NULL COMMENT '供货商编码',
  `ShangName` varchar(20) DEFAULT NULL COMMENT '供货商名称',
  `address` varchar(50) DEFAULT NULL COMMENT '供货商地址',
  `JingYin` varchar(20) DEFAULT NULL COMMENT '经营情况',
  `WangZhi` varchar(50) DEFAULT NULL COMMENT '网址',
  `KaiHu` varchar(50) DEFAULT NULL COMMENT '开户行',
  `YinHangCard` varchar(50) DEFAULT NULL COMMENT '银行卡号',
  `GoodsNo` varchar(50) DEFAULT NULL COMMENT '供应商品编码',
  `FuKuan` varchar(20) DEFAULT NULL COMMENT '付款方式',
  `ShangGraden` varchar(20) DEFAULT NULL COMMENT '厂商等级',
  `JingYinType` varchar(20) DEFAULT NULL COMMENT '经营品牌',
  `ShangType` varchar(20) DEFAULT NULL COMMENT '厂商类别',
  `LianXi` varchar(11) DEFAULT NULL COMMENT '联系人',
  `DianHua` varchar(11) DEFAULT NULL COMMENT '电话',
  `ShouJi` varchar(11) DEFAULT NULL COMMENT '手机',
  `Email` varchar(50) DEFAULT NULL COMMENT 'email',
  `ZhangQi` datetime DEFAULT NULL COMMENT '账期',
  `remark` varchar(200) DEFAULT NULL,
  `bei1` varchar(100) DEFAULT NULL COMMENT '备用1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '备用2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '备用3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '备用4',
  PRIMARY KEY (`HuoShangNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `huoshang` */

/*Table structure for table `jigong` */

DROP TABLE IF EXISTS `jigong`;

CREATE TABLE `jigong` (
  `JiGongNo` varchar(20) NOT NULL COMMENT '技工id',
  `jiGongXing` int(8) DEFAULT NULL COMMENT '技工星级id',
  `BanId` int(8) DEFAULT NULL COMMENT '归属班组id',
  `WeiXiuType` varchar(50) DEFAULT NULL COMMENT '维修工种',
  `WeiXiuBank` varchar(50) DEFAULT NULL COMMENT '维修品牌',
  `JiGongName` varchar(50) DEFAULT NULL COMMENT '技工姓名',
  `sex` char(2) DEFAULT NULL COMMENT '性别',
  `phone` varchar(11) DEFAULT NULL COMMENT '手机',
  `login` varchar(20) DEFAULT NULL COMMENT '登陆账号',
  `address` varchar(50) DEFAULT NULL COMMENT '地址',
  `wx` varchar(20) DEFAULT NULL COMMENT '微信',
  `birthday` date DEFAULT NULL COMMENT '生日',
  `idCard` varchar(20) DEFAULT NULL COMMENT '身份证号',
  `HuKouAddress` varchar(100) DEFAULT NULL COMMENT '户口地址',
  `Bank` varchar(100) DEFAULT NULL COMMENT '开户银行',
  `BankCard` varchar(30) DEFAULT NULL COMMENT '银行卡号',
  `isZuZhang` int(2) DEFAULT '0' COMMENT '是否组长',
  `bei1` varchar(100) DEFAULT NULL COMMENT '备用1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '备用2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '备用3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '备用4',
  PRIMARY KEY (`JiGongNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `jigong` */

insert  into `jigong`(`JiGongNo`,`jiGongXing`,`BanId`,`WeiXiuType`,`WeiXiuBank`,`JiGongName`,`sex`,`phone`,`login`,`address`,`wx`,`birthday`,`idCard`,`HuKouAddress`,`Bank`,`BankCard`,`isZuZhang`,`bei1`,`bei2`,`bei3`,`bei4`) values 
('jgbh001',1,1,'补胎','丰田','钟彭根','男','12345678996','123654','北京','12345678996','1991-02-04','365425894122257896','上海','长沙银行','5698524698752365489',1,'bei1','bei2','bei3','bei4'),
('jgbh002',2,2,'喷漆','东方','就二分','女','34567976543','243456','深圳','34567976543','1993-01-03','343434343434343434','上海','交通银行','1231231231231231231',0,'bei1','bei2','bei3','bei4'),
('jgbh003',3,3,'发动机','红旗','钟哦根','男','34567543789','767878','南京','34567543789','1994-09-04','454545454545454545','上海','中国银行','2342342342342342342',0,'bei1','bei2','bei3','bei4'),
('jgbh004',1,4,'改装','日产','计划','女','12312312311','898989','湖南','12312312311','1991-09-07','565656565656565656','上海','建设银行','3453453453453453453',0,'bei1','bei2','bei3','bei4');

/*Table structure for table `jigongban` */

DROP TABLE IF EXISTS `jigongban`;

CREATE TABLE `jigongban` (
  `BanId` int(8) NOT NULL AUTO_INCREMENT COMMENT '技工班组id',
  `BanName` varchar(50) DEFAULT NULL COMMENT '班组名称',
  `parentId` int(8) DEFAULT NULL COMMENT '技工班组父级id',
  `bei1` varchar(100) DEFAULT NULL COMMENT '备用1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '备用2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '备用3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '备用4',
  PRIMARY KEY (`BanId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `jigongban` */

insert  into `jigongban`(`BanId`,`BanName`,`parentId`,`bei1`,`bei2`,`bei3`,`bei4`) values 
(1,'自建',0,'bei1','bei2','bei3','bei4'),
(2,'1队',1,'bei1','bei2','bei3','bei4'),
(3,'2队',1,'bei1','bei2','bei3','bei4'),
(4,'3队',1,'bei1','bei2','bei3','bei4'),
(5,'4队',1,'bei1','bei2','bei3','bei4');

/*Table structure for table `jigongstar` */

DROP TABLE IF EXISTS `jigongstar`;

CREATE TABLE `jigongstar` (
  `JiStarId` int(8) NOT NULL COMMENT '技工星级id',
  `StarName` varchar(20) DEFAULT NULL COMMENT '技工星级名称',
  `TiCheng` varchar(50) DEFAULT NULL COMMENT '提成权重',
  `bei1` varchar(100) DEFAULT NULL COMMENT '备用1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '备用2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '备用3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '备用4',
  PRIMARY KEY (`JiStarId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `jigongstar` */

insert  into `jigongstar`(`JiStarId`,`StarName`,`TiCheng`,`bei1`,`bei2`,`bei3`,`bei4`) values 
(1,'1星级','1','bei1','bei2','bei3','bei4'),
(2,'2星级','2','bei1','bei2','bei3','bei4'),
(3,'3星级','3','bei1','bei2','bei3','bei4');

/*Table structure for table `jiuyuan` */

DROP TABLE IF EXISTS `jiuyuan`;

CREATE TABLE `jiuyuan` (
  `jyDanNo` varchar(20) DEFAULT NULL COMMENT '救援单号',
  `jyChepai` varchar(20) DEFAULT NULL COMMENT '救援车辆车牌',
  `jyGuwen` varchar(50) DEFAULT NULL COMMENT '救援服务顾问',
  `jyYeWuType` varchar(20) DEFAULT NULL COMMENT '救援业务类别',
  `jyShiGong` varchar(20) DEFAULT NULL COMMENT '救援施工班次',
  `nowLicheng` double DEFAULT NULL COMMENT '当前里程',
  `Paigongtime` datetime DEFAULT NULL COMMENT '派工时间',
  `PaigongBanzu` int(6) DEFAULT NULL COMMENT '派工班组（id）',
  `ChuFaTime` datetime DEFAULT NULL COMMENT '出发时间',
  `ChuFaAddress` varchar(100) DEFAULT NULL COMMENT '出发地址',
  `JiaShiCar` varchar(20) DEFAULT NULL COMMENT '驾驶车辆',
  `jyLiChen` double DEFAULT NULL COMMENT '救援行驶里程',
  `jyEndAddress` varchar(100) DEFAULT NULL COMMENT '救援地址',
  `jyEndTime` datetime DEFAULT NULL COMMENT '救援到达时间',
  `WanGongTime` datetime DEFAULT NULL COMMENT '完工时间',
  `Yugumoney` double DEFAULT NULL COMMENT '预估金额',
  `tureMoney` double DEFAULT NULL COMMENT '实际金额',
  `remark` varchar(200) DEFAULT NULL,
  `jyChengShu` varchar(200) DEFAULT NULL COMMENT '救援陈述',
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
  `wxDanNo` varchar(20) DEFAULT NULL COMMENT '维修单号',
  `isHeGe` char(2) DEFAULT NULL COMMENT '是否合格完工',
  `YuJiTime` datetime DEFAULT NULL COMMENT '预计完工时间',
  `ShiJiTime` datetime DEFAULT NULL COMMENT '实际完工时间',
  `WuGong` varchar(100) DEFAULT NULL COMMENT '误工原因',
  `ZhiJian` varchar(100) DEFAULT NULL COMMENT '质检',
  `WuGongRen` varchar(100) DEFAULT NULL COMMENT '误工责任人',
  `WuGongChuFa` double DEFAULT NULL COMMENT '误工处罚金额',
  `FanGongCi` int(11) DEFAULT NULL COMMENT '返工次数',
  `FanGong` varchar(100) DEFAULT NULL COMMENT '返工原因',
  `FanGongRen` varchar(100) DEFAULT NULL COMMENT '返工责任人',
  `FanGongChuFa` double DEFAULT NULL COMMENT '返工处罚金额',
  `bei1` varchar(100) DEFAULT NULL COMMENT '备用1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '备用2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '备用3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '备用4'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `jungong` */

/*Table structure for table `kehu` */

DROP TABLE IF EXISTS `kehu`;

CREATE TABLE `kehu` (
  `kehuid` int(11) NOT NULL AUTO_INCREMENT COMMENT '客户id',
  `KeHuNo` varchar(20) DEFAULT NULL COMMENT '客户编码',
  `KeHuName` varchar(20) DEFAULT NULL COMMENT '客户名称',
  `KeHuAddress` varchar(100) DEFAULT NULL COMMENT '客户地址',
  `ZhuAddress` varchar(100) DEFAULT NULL COMMENT '注册地址',
  `KeHuBirthday` date DEFAULT NULL COMMENT '客户生日',
  `KeHuType` varchar(20) DEFAULT NULL COMMENT '客户类型',
  `KeHuLianXi` varchar(100) DEFAULT NULL COMMENT '客户联系人',
  `KeHuPhone` varchar(100) DEFAULT NULL COMMENT '客户电话',
  `ZhangQi` datetime DEFAULT NULL COMMENT '账期',
  `GuaZhang` double DEFAULT NULL COMMENT '挂账',
  `eDu` double DEFAULT NULL COMMENT '额度',
  `DinJin` double DEFAULT NULL COMMENT '定金余额',
  `GuWen` varchar(20) DEFAULT NULL COMMENT '专属顾问',
  `GuWenPhone` varchar(11) DEFAULT NULL COMMENT '顾问电话',
  `ChePai` varchar(20) DEFAULT NULL COMMENT '车牌号码',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  `JiFen` int(8) DEFAULT NULL COMMENT '积分',
  `ZhuPhone` varchar(11) DEFAULT NULL COMMENT '注册电话',
  `bank` varchar(50) DEFAULT NULL COMMENT '开户银行',
  `bankcard` varchar(20) DEFAULT NULL COMMENT '银行卡号',
  `bei1` varchar(100) DEFAULT NULL COMMENT '备用1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '备用2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '备用3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '备用4',
  PRIMARY KEY (`kehuid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `kehu` */

insert  into `kehu`(`kehuid`,`KeHuNo`,`KeHuName`,`KeHuAddress`,`ZhuAddress`,`KeHuBirthday`,`KeHuType`,`KeHuLianXi`,`KeHuPhone`,`ZhangQi`,`GuaZhang`,`eDu`,`DinJin`,`GuWen`,`GuWenPhone`,`ChePai`,`remark`,`JiFen`,`ZhuPhone`,`bank`,`bankcard`,`bei1`,`bei2`,`bei3`,`bei4`) values 
(1,'111111','南通市神龙电器有限公司','人民路126号',NULL,'2020-01-21','一般客户','南通市神龙电器有限公司','13117331859','0000-00-00 00:00:00',0,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `kehucar` */

DROP TABLE IF EXISTS `kehucar`;

CREATE TABLE `kehucar` (
  `ChePai` varchar(20) NOT NULL COMMENT '车牌',
  `KeHuNo` varchar(20) DEFAULT NULL COMMENT '外键，关联客户表kehuid',
  `CarBankId` int(8) DEFAULT NULL COMMENT '汽车品牌id',
  `XingHao` varchar(20) DEFAULT NULL COMMENT '汽车型号',
  `SiJiName` varchar(20) DEFAULT NULL COMMENT '司机姓名',
  `SiJiPhone` varchar(11) DEFAULT NULL COMMENT '司机电话',
  `SiJiBirthday` date DEFAULT NULL COMMENT '司机生日',
  `GuiShu` varchar(20) DEFAULT NULL COMMENT '车辆归属',
  `JiaZhao` datetime DEFAULT NULL COMMENT '驾照到期',
  `CheJia` varchar(20) DEFAULT NULL COMMENT '车架号',
  `FaBankId` int(8) DEFAULT NULL COMMENT '发动机品牌id',
  `NianKuan` double DEFAULT NULL COMMENT '汽车年款',
  `LiCheng` int(8) DEFAULT NULL COMMENT '里程',
  `ZaiZhong` int(8) DEFAULT NULL COMMENT '载重',
  `GouMaiDate` date DEFAULT NULL COMMENT '购买日期',
  `ShanPaiDate` date DEFAULT NULL COMMENT '上牌日期',
  `CheJian` date DEFAULT NULL COMMENT '车检到期',
  `RanYou` varchar(20) DEFAULT NULL COMMENT '燃油类别',
  `CheXi` varchar(50) DEFAULT NULL COMMENT '车系',
  `nextBaoXian` int(8) DEFAULT NULL COMMENT '下次保险里程',
  `nextBaoXianDate` date DEFAULT NULL COMMENT '下次保险日期',
  `bei1` varchar(100) DEFAULT NULL COMMENT '备用1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '备用2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '备用3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '备用4',
  PRIMARY KEY (`ChePai`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `kehucar` */

insert  into `kehucar`(`ChePai`,`KeHuNo`,`CarBankId`,`XingHao`,`SiJiName`,`SiJiPhone`,`SiJiBirthday`,`GuiShu`,`JiaZhao`,`CheJia`,`FaBankId`,`NianKuan`,`LiCheng`,`ZaiZhong`,`GouMaiDate`,`ShanPaiDate`,`CheJian`,`RanYou`,`CheXi`,`nextBaoXian`,`nextBaoXianDate`,`bei1`,`bei2`,`bei3`,`bei4`) values 
('渝D705C8','1',NULL,'重汽汕德卡','重庆成高','17783905571','1979-10-24',NULL,'2020-01-21 20:45:35',NULL,NULL,NULL,200000,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `kehuxiaofei` */

DROP TABLE IF EXISTS `kehuxiaofei`;

CREATE TABLE `kehuxiaofei` (
  `xiaoid` int(8) NOT NULL AUTO_INCREMENT COMMENT '客户消费id',
  `dantype` varchar(20) DEFAULT NULL COMMENT '单据类型',
  `xsdanhao` varchar(20) DEFAULT NULL COMMENT '销售单号',
  `chepai` varchar(20) DEFAULT NULL COMMENT '车牌',
  `wxyewu` varchar(20) DEFAULT NULL COMMENT '维修业务',
  `jincdate` date DEFAULT NULL COMMENT '进厂时间',
  `overdate` date DEFAULT NULL COMMENT '完工时间',
  `jiesdate` date DEFAULT NULL COMMENT '结算时间',
  `price` double DEFAULT NULL COMMENT '消费金额',
  `KeHuNo` varchar(20) DEFAULT NULL COMMENT '客户编号，外键',
  `bei1` varchar(100) DEFAULT NULL COMMENT '备用1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '备用2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '备用3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '备用4',
  PRIMARY KEY (`xiaoid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `kehuxiaofei` */

/*Table structure for table `lingliao` */

DROP TABLE IF EXISTS `lingliao`;

CREATE TABLE `lingliao` (
  `llid` int(6) NOT NULL AUTO_INCREMENT COMMENT '领料表id',
  `wxDanNo` varchar(20) DEFAULT NULL COMMENT '维修单号',
  `lldate` datetime DEFAULT NULL COMMENT '领料日期',
  `llperple` varchar(20) DEFAULT NULL COMMENT '领料人',
  `wuLiaoid` int(6) DEFAULT NULL COMMENT '物料id',
  `number` int(6) DEFAULT NULL COMMENT '数量',
  `fuwuguwen` varchar(20) DEFAULT NULL COMMENT '服务顾问',
  `bei1` varchar(100) DEFAULT NULL COMMENT '备用1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '备用2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '备用3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '备用4',
  `bei5` varchar(100) DEFAULT NULL COMMENT '备用5',
  `bei6` varchar(100) DEFAULT NULL COMMENT '备用6',
  PRIMARY KEY (`llid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `lingliao` */

/*Table structure for table `lizhi` */

DROP TABLE IF EXISTS `lizhi`;

CREATE TABLE `lizhi` (
  `YuanNo` varchar(20) DEFAULT NULL COMMENT '员工编号',
  `LiZhiTime` datetime DEFAULT NULL COMMENT '离职时间',
  `remark` varchar(200) DEFAULT NULL COMMENT '离职原因',
  `bei1` varchar(100) DEFAULT NULL COMMENT '备用1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '备用2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '备用3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '备用4'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `lizhi` */

insert  into `lizhi`(`YuanNo`,`LiZhiTime`,`remark`,`bei1`,`bei2`,`bei3`,`bei4`) values 
('ygbh001','2020-11-03 00:00:00','不想干了','bei1','bei2','bei3','bei4');

/*Table structure for table `permissions` */

DROP TABLE IF EXISTS `permissions`;

CREATE TABLE `permissions` (
  `pid` int(8) NOT NULL AUTO_INCREMENT COMMENT '权限编号',
  `pname` varchar(50) DEFAULT NULL COMMENT '权限中文名称',
  `penglishname` varchar(50) DEFAULT NULL COMMENT '权限英文名称',
  `catalog` int(3) DEFAULT NULL COMMENT '目录/功能',
  `parentid` int(8) DEFAULT NULL COMMENT '权限父级编号',
  `path` varchar(100) DEFAULT NULL COMMENT '路径',
  `bei1` varchar(100) DEFAULT NULL COMMENT '备用1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '备用2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '备用3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '备用4',
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

/*Data for the table `permissions` */

insert  into `permissions`(`pid`,`pname`,`penglishname`,`catalog`,`parentid`,`path`,`bei1`,`bei2`,`bei3`,`bei4`) values 
(1,'维修救援','jiuyuan',0,10,NULL,NULL,NULL,NULL,NULL),
(2,'维修接车','jieche',1,1,NULL,NULL,NULL,NULL,NULL),
(3,'竣工检验','jianyan',1,1,NULL,NULL,NULL,NULL,NULL),
(4,'客户档案','dangan',0,11,NULL,NULL,NULL,NULL,NULL),
(5,'客户资料','kehu',1,4,NULL,NULL,NULL,NULL,NULL),
(6,'车辆资料','chelian',1,4,NULL,NULL,NULL,NULL,NULL),
(7,'主数据','shuju',0,12,NULL,NULL,NULL,NULL,NULL),
(8,'发动机品牌','pinpai',1,7,NULL,NULL,NULL,NULL,NULL),
(9,'前台','qiantai',0,0,NULL,NULL,NULL,NULL,NULL),
(10,'维修','weixiu',0,0,NULL,NULL,NULL,NULL,NULL),
(11,'客服','kefu',0,0,NULL,NULL,NULL,NULL,NULL),
(12,'数据','shujul',0,0,NULL,NULL,NULL,NULL,NULL),
(13,'人事','renshi',0,0,NULL,NULL,NULL,NULL,NULL),
(14,'系统','xitong',0,0,NULL,NULL,NULL,NULL,NULL),
(15,'维修项目','xiangmu',1,7,NULL,NULL,NULL,NULL,NULL),
(16,'商品资料','goods',1,7,NULL,NULL,NULL,NULL,NULL),
(17,'供货单位','gonghuo',1,7,NULL,NULL,NULL,NULL,NULL),
(18,'员工资料','yuangong',0,13,NULL,NULL,NULL,NULL,NULL),
(19,'组织结构','zuzhi',1,18,NULL,NULL,NULL,NULL,NULL),
(20,'岗位定义','gangwei',1,18,NULL,NULL,NULL,NULL,NULL),
(21,'技工管理','jigong',0,13,NULL,NULL,NULL,NULL,NULL),
(22,'技工星级','xinji',1,21,NULL,NULL,NULL,NULL,NULL),
(23,'班组技工','banzu',1,21,NULL,NULL,NULL,NULL,NULL),
(24,'外勤车辆','waiqin',1,21,NULL,NULL,NULL,NULL,NULL),
(25,'权限控制','kozhi',0,14,NULL,NULL,NULL,NULL,NULL),
(26,'角色权限控制','juese',1,25,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `pinzhi` */

DROP TABLE IF EXISTS `pinzhi`;

CREATE TABLE `pinzhi` (
  `PinZhiId` int(8) DEFAULT NULL COMMENT '招聘职务id，对应职务表',
  `number` int(4) DEFAULT NULL COMMENT '招聘人员数量',
  `requeir` varchar(100) DEFAULT NULL COMMENT '招聘要求',
  `ender` datetime DEFAULT NULL COMMENT '截止时间',
  `bei1` varchar(100) DEFAULT NULL COMMENT '备用1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '备用2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '备用3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '备用4'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `pinzhi` */

/*Table structure for table `quanxian` */

DROP TABLE IF EXISTS `quanxian`;

CREATE TABLE `quanxian` (
  `QuanXianId` int(11) NOT NULL AUTO_INCREMENT COMMENT '权限id',
  `QuanXianName` varchar(50) DEFAULT NULL COMMENT '权限名',
  `url` varchar(100) DEFAULT NULL COMMENT '路径',
  `remark` varchar(200) DEFAULT NULL,
  `bei1` varchar(100) DEFAULT NULL COMMENT '备用1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '备用2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '备用3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '备用4',
  PRIMARY KEY (`QuanXianId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `quanxian` */

/*Table structure for table `roles_perms` */

DROP TABLE IF EXISTS `roles_perms`;

CREATE TABLE `roles_perms` (
  `rolesid` int(8) NOT NULL AUTO_INCREMENT COMMENT '角色/权限id',
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
  `YuanNo` varchar(20) DEFAULT NULL COMMENT '员工id',
  `RuZhiTime` datetime DEFAULT NULL COMMENT '入职时间',
  `bei1` varchar(100) DEFAULT NULL COMMENT '备用1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '备用2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '备用3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '备用4'
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
  `SaleNo` varchar(50) NOT NULL COMMENT '销售单号',
  `SaleType` varchar(50) DEFAULT NULL COMMENT '销售类型',
  `GoodsId` int(8) DEFAULT NULL COMMENT '商品id',
  `GoodsNumber` int(8) DEFAULT NULL COMMENT '商品数量',
  `SaleTime` datetime DEFAULT NULL COMMENT '销售时间',
  `KaiDan` varchar(50) DEFAULT NULL COMMENT '开单人',
  `KeHuNo` varchar(20) DEFAULT NULL COMMENT '客户编号',
  `JieSuan` varchar(50) DEFAULT NULL COMMENT '结算人',
  `HuiYuanNo` varchar(50) DEFAULT NULL COMMENT '会员卡号',
  `JieSuanType` varchar(50) DEFAULT NULL COMMENT '结算方式',
  `JieSuanTime` datetime DEFAULT NULL COMMENT '结算时间',
  `money` double DEFAULT NULL COMMENT '金额',
  `YouHui` varchar(50) DEFAULT NULL COMMENT '优惠',
  `YouHuiType` varchar(50) DEFAULT NULL COMMENT '优惠类型',
  `bei1` varchar(100) DEFAULT NULL COMMENT '备用1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '备用2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '备用3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '备用4',
  PRIMARY KEY (`SaleNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sale` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `userid` int(8) NOT NULL AUTO_INCREMENT,
  `loginName` varchar(20) DEFAULT NULL COMMENT '登陆账号',
  `password` varchar(20) DEFAULT NULL COMMENT '密码',
  `yuanNo` varchar(20) DEFAULT NULL COMMENT '员工编号',
  `bei1` varchar(100) DEFAULT NULL COMMENT '备用1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '备用2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '备用3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '备用4',
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

/*Table structure for table `waiqingcar` */

DROP TABLE IF EXISTS `waiqingcar`;

CREATE TABLE `waiqingcar` (
  `ChePai` varchar(10) NOT NULL COMMENT '车牌号码',
  `CarBank` varchar(20) DEFAULT NULL COMMENT '车辆品牌',
  `CheXing` varchar(50) DEFAULT NULL COMMENT '车型',
  `NowLi` varchar(10) DEFAULT NULL COMMENT '当前里程',
  `BanId` int(8) DEFAULT NULL COMMENT '归属技工班组id',
  `bei1` varchar(100) DEFAULT NULL COMMENT '备用1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '备用2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '备用3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '备用4',
  PRIMARY KEY (`ChePai`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `waiqingcar` */

/*Table structure for table `wxjiedan` */

DROP TABLE IF EXISTS `wxjiedan`;

CREATE TABLE `wxjiedan` (
  `wxDanNo` varchar(20) NOT NULL COMMENT '维修单号',
  `wxDanType` varchar(20) DEFAULT NULL COMMENT '维修单据类型',
  `wxType` varchar(20) DEFAULT NULL COMMENT '维修类型',
  `DanJuStatu` varchar(20) DEFAULT NULL COMMENT '单据状态',
  `Kaidantime` datetime DEFAULT NULL COMMENT '开单时间',
  `KeHunNo` varchar(20) DEFAULT NULL COMMENT '客户编号',
  `ChePai` varchar(20) DEFAULT NULL COMMENT '车牌号码',
  `CarBankId` int(8) DEFAULT NULL COMMENT '汽车品牌id',
  `CarXingHao` varchar(50) DEFAULT NULL COMMENT '汽车型号',
  `CheJiaXingHao` varchar(50) DEFAULT NULL COMMENT '车架型号',
  `FaNumber` varchar(50) DEFAULT NULL COMMENT '发动机号',
  `FaBankId` int(8) DEFAULT NULL COMMENT '发动机品牌id',
  `GuWen` varchar(20) DEFAULT NULL COMMENT '服务顾问',
  `CheZhu` varchar(20) DEFAULT NULL COMMENT '车主姓名',
  `SiJiName` varchar(20) DEFAULT NULL COMMENT '司机姓名',
  `LianPhone` varchar(20) DEFAULT NULL COMMENT '联系电话',
  `JinChanLi` int(20) DEFAULT NULL COMMENT '进厂里程',
  `JinChanYou` int(20) DEFAULT NULL COMMENT '进厂油量',
  `prevLi` int(20) DEFAULT NULL COMMENT '上次里程',
  `prevTime` datetime DEFAULT NULL COMMENT '上次进厂',
  `JinChanTime` datetime DEFAULT NULL COMMENT '进厂时间',
  `YeWuType` varchar(20) DEFAULT NULL COMMENT '业务类别',
  `ShiGong` varchar(20) DEFAULT NULL COMMENT '施工班次',
  `JieChe` varchar(20) DEFAULT NULL COMMENT '接车人',
  `YuJiTime` datetime DEFAULT NULL COMMENT '预计完工时间',
  `WanGongTime` datetime DEFAULT NULL COMMENT '完工时间',
  `JieSuanType` varchar(20) DEFAULT NULL COMMENT '结算方式',
  `jieSuantime` datetime DEFAULT NULL COMMENT '结算时间',
  `jieSuanmoney` double DEFAULT NULL COMMENT '结算金额',
  `PeiKuan` varchar(20) DEFAULT NULL COMMENT '赔款公司',
  `Money` double DEFAULT NULL COMMENT '预估金额，包括修理需要的零配件',
  `saleNo` varchar(20) DEFAULT NULL COMMENT '附属销售号',
  `BaoXiu` varchar(20) DEFAULT NULL COMMENT '保修陈述',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  `bei1` varchar(100) DEFAULT NULL COMMENT '备用1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '备用2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '备用3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '备用4',
  PRIMARY KEY (`wxDanNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `wxjiedan` */

/*Table structure for table `wxshouru` */

DROP TABLE IF EXISTS `wxshouru`;

CREATE TABLE `wxshouru` (
  `ShouRuId` int(8) NOT NULL AUTO_INCREMENT COMMENT '收入类型id',
  `ShouRuType` varchar(50) DEFAULT NULL COMMENT '收入种类名称',
  `bei1` varchar(100) DEFAULT NULL COMMENT '备用1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '备用2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '备用3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '备用4',
  PRIMARY KEY (`ShouRuId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `wxshouru` */

/*Table structure for table `wxxiangmu` */

DROP TABLE IF EXISTS `wxxiangmu`;

CREATE TABLE `wxxiangmu` (
  `XiangMuNo` varchar(50) NOT NULL COMMENT '项目编码',
  `XiangMuName` varchar(100) DEFAULT NULL COMMENT '项目名称',
  `XingMuType` varchar(100) DEFAULT NULL COMMENT '项目类型',
  `ShouJiaAn` varchar(20) DEFAULT NULL COMMENT '售价按',
  `ShouRuid` int(8) DEFAULT NULL COMMENT '收入种类id',
  `price` double DEFAULT NULL COMMENT '标准价',
  `VIPprice` double DEFAULT NULL COMMENT 'vip价',
  `huiPrice` double DEFAULT NULL COMMENT '会员价',
  `xiePrice` double DEFAULT NULL COMMENT '协议价',
  `bei1` varchar(100) DEFAULT NULL COMMENT '备用1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '备用2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '备用3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '备用4',
  PRIMARY KEY (`XiangMuNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `wxxiangmu` */

/*Table structure for table `yuangong` */

DROP TABLE IF EXISTS `yuangong`;

CREATE TABLE `yuangong` (
  `yuanNo` varchar(20) NOT NULL COMMENT '员工编号',
  `shuXingId` int(8) DEFAULT NULL COMMENT '属性id',
  `BuMenId` int(8) DEFAULT NULL COMMENT '所属部门id',
  `yuanName` varchar(20) DEFAULT NULL COMMENT '员工姓名',
  `birthday` date DEFAULT NULL COMMENT '出生日期',
  `sex` char(2) DEFAULT NULL COMMENT '性别',
  `phone` varchar(15) DEFAULT NULL COMMENT '联系电话',
  `emPeople` varchar(20) DEFAULT NULL COMMENT '紧急联系人',
  `emPhone` varchar(11) DEFAULT NULL COMMENT '紧急联系人电话',
  `ZhiWuId` varchar(8) DEFAULT NULL COMMENT '职务id',
  `nowAddress` varchar(50) DEFAULT NULL COMMENT '现住地址',
  `HuAddress` varchar(50) DEFAULT NULL COMMENT '户口地址',
  `bank` varchar(50) DEFAULT NULL COMMENT '开户银行',
  `cardNumber` varchar(25) DEFAULT NULL COMMENT '银行帐号',
  `email` varchar(30) DEFAULT NULL COMMENT '邮箱',
  `bodystate` varchar(20) DEFAULT NULL COMMENT '身体状况',
  `height` int(4) DEFAULT NULL COMMENT '身高',
  `JiGuan` varchar(100) DEFAULT NULL COMMENT '籍贯',
  `MinZu` varchar(10) DEFAULT NULL COMMENT '民族',
  `HunYin` varchar(10) DEFAULT NULL COMMENT '婚姻状况',
  `XueLi` varchar(20) DEFAULT NULL COMMENT '学历',
  `BiYe` varchar(50) DEFAULT NULL COMMENT '毕业学校',
  `ZhuanYe` varchar(20) DEFAULT NULL COMMENT '专业',
  `ZhuanYezg` varchar(50) DEFAULT NULL COMMENT '专业资格',
  `xueWei` varchar(50) DEFAULT NULL COMMENT '学位',
  `bianZhi` varchar(50) DEFAULT NULL COMMENT '编制',
  `IDcard` varchar(20) DEFAULT NULL COMMENT '身份证号码',
  `shouJi` varchar(11) DEFAULT NULL COMMENT '手机',
  `ShiYong` date DEFAULT NULL COMMENT '试用到期',
  `HeTongstart` date DEFAULT NULL COMMENT '合同开始日期',
  `HeTongEnd` date DEFAULT NULL COMMENT '合同结束日期',
  `KaZi` varchar(20) DEFAULT NULL COMMENT '卡自编号',
  `KaNei` varchar(20) DEFAULT NULL COMMENT '卡内部号',
  `TuiJian` varchar(20) DEFAULT NULL COMMENT '推荐人',
  `zdZheKou` double DEFAULT NULL COMMENT '整单折扣权',
  `gsZheKou` double DEFAULT NULL COMMENT '工时折扣权',
  `spZheKou` double DEFAULT NULL COMMENT '商品折扣权',
  `jianMian` double DEFAULT NULL COMMENT '减免权',
  `fenqi` varchar(20) DEFAULT NULL COMMENT '分期短号',
  `sflz` int(8) DEFAULT NULL COMMENT '是否离职1表示已经离职0表示没有离职',
  `gangweId` int(8) DEFAULT NULL COMMENT '岗位id',
  `login` varchar(20) DEFAULT NULL COMMENT '登陆账号',
  `bei1` varchar(100) DEFAULT NULL COMMENT '备用1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '备用2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '备用3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '备用4',
  PRIMARY KEY (`yuanNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `yuangong` */

insert  into `yuangong`(`yuanNo`,`shuXingId`,`BuMenId`,`yuanName`,`birthday`,`sex`,`phone`,`emPeople`,`emPhone`,`ZhiWuId`,`nowAddress`,`HuAddress`,`bank`,`cardNumber`,`email`,`bodystate`,`height`,`JiGuan`,`MinZu`,`HunYin`,`XueLi`,`BiYe`,`ZhuanYe`,`ZhuanYezg`,`xueWei`,`bianZhi`,`IDcard`,`shouJi`,`ShiYong`,`HeTongstart`,`HeTongEnd`,`KaZi`,`KaNei`,`TuiJian`,`zdZheKou`,`gsZheKou`,`spZheKou`,`jianMian`,`fenqi`,`sflz`,`gangweId`,`login`,`bei1`,`bei2`,`bei3`,`bei4`) values 
('ygbh001',1,1,'宁陈清','1997-09-27','男','18974159998','李剑豪','13754893247','0','攸县','深圳','长沙银行','3587459854124785478','1837638100@qq.com','健康',168,'湖南','汉','未婚','高等教育','清华大学','计算机软件','高级工程师','博士','正式员工','430223845951236578','18974159998','2014-08-09','2014-08-10','3014-08-10','123456','123456','唐勇',80,70,60,50,'28598547',0,1,'123676','bei1','bei2','bei3','bei4'),
('ygbh002',2,2,'里斯好','1994-09-07','女','18958749512','宁陈清','13789645721','0','广东','北京','交通银行','3587567854123987564','1895874951@qq.com','健康',188,'广东','满','已婚','中等教育','北京大学','网络工程','中级工程师','硕士','非正式员工','430223896547521458','13789645721','2010-02-10','2010-02-11','3010-02-11','654321','654321','隶属',70,60,50,40,'56886468',0,2,'765345','bei1','bei2','bei3','bei4'),
('ygbh003',3,3,'我的娃','1993-01-17','男','13754896548','魔法师','15484135151','0','北京','深圳','中国银行','3587458683393948687','2584668468@qq.com','不健康',138,'北京','壮','未婚','处等教育','复旦大学','计算机软件','初级工程师','本科','正式员工','963258741365475632','36954751811','2009-07-19','2009-07-20','3009-07-21','969866','969866','味道',60,50,40,30,'67868689',0,3,'234765','bei1','bei2','bei3','bei4'),
('ygbh004',4,4,'吴大维','1987-10-27','女','12312412423','但是我','35464657757','0','上海','珠海','建设银行','1353523534634634646','3234234234@qq.com','健康',211,'上海','藏','已婚','高等教育','清华大学','计算机软件','高级工程师','博士','正式员工','124345646456756757','23446789455','2004-03-09','2004-03-19','3004-03-19','324234','324234','我的',0,0,0,0,'23213567',1,4,'789678','bei1','bei2','bei3','bei4');

/*Table structure for table `yuangongshu` */

DROP TABLE IF EXISTS `yuangongshu`;

CREATE TABLE `yuangongshu` (
  `shuXingId` int(8) NOT NULL AUTO_INCREMENT COMMENT '员工属性id',
  `shuXingName` varchar(50) DEFAULT NULL COMMENT '员工属性名称',
  `bei1` varchar(100) DEFAULT NULL COMMENT '备用1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '备用2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '备用3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '备用4',
  PRIMARY KEY (`shuXingId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `yuangongshu` */

insert  into `yuangongshu`(`shuXingId`,`shuXingName`,`bei1`,`bei2`,`bei3`,`bei4`) values 
(1,'计考勤计薪','bei1','bei2','bei3','bei4'),
(2,'不考勤计薪','bei1','bei2','bei3','bei4'),
(3,'计考勤不计薪','bei1','bei2','bei3','bei4'),
(4,'不考勤不计薪','bei1','bei2','bei3','bei4');

/*Table structure for table `zhiwu` */

DROP TABLE IF EXISTS `zhiwu`;

CREATE TABLE `zhiwu` (
  `ZhiWuId` varchar(20) NOT NULL COMMENT '职务id',
  `zhiWuName` varchar(50) DEFAULT NULL COMMENT '职务名称',
  `GongZi` double DEFAULT NULL COMMENT '工资',
  `bei1` varchar(100) DEFAULT NULL COMMENT '备用1',
  `bei2` varchar(100) DEFAULT NULL COMMENT '备用2',
  `bei3` varchar(100) DEFAULT NULL COMMENT '备用3',
  `bei4` varchar(100) DEFAULT NULL COMMENT '备用4',
  PRIMARY KEY (`ZhiWuId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `zhiwu` */

insert  into `zhiwu`(`ZhiWuId`,`zhiWuName`,`GongZi`,`bei1`,`bei2`,`bei3`,`bei4`) values 
('1','总经理',30000,NULL,NULL,NULL,NULL),
('10','会计',10000,NULL,NULL,NULL,NULL),
('11','监察',5000,NULL,NULL,NULL,NULL),
('2','站长',20000,NULL,NULL,NULL,NULL),
('3','服务经理',10000,NULL,NULL,NULL,NULL),
('4','技术总监',10000,NULL,NULL,NULL,NULL),
('5','车间主任',10000,NULL,NULL,NULL,NULL),
('6','配件经理',10000,NULL,NULL,NULL,NULL),
('7','服务顾问',10000,NULL,NULL,NULL,NULL),
('8','库管员',10000,NULL,NULL,NULL,NULL),
('9','鉴定员',10000,NULL,NULL,NULL,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
