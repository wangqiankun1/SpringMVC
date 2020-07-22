/*
Navicat MySQL Data Transfer
Source Host     : localhost:3306
Source Database : stu
Target Host     : localhost:3306
Target Database : stu
Date: 2019-10-15 21:28:51
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for stu
-- ----------------------------
DROP TABLE IF EXISTS `stu`;
CREATE TABLE `stu` (
  `姓名` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `性别` varchar(255) DEFAULT NULL,
  `年龄` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `生日` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `电话` varchar(255) DEFAULT NULL,
  `地址` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`姓名`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of stu
-- ----------------------------
INSERT INTO `stu` VALUES ('', '', '', '', '', '');
INSERT INTO `stu` VALUES ('温馨', '女', '20', '1999', '120', '吉林');
INSERT INTO `stu` VALUES ('王乾坤', '男', '541813460334', '1998.10.16', '15514340161', '河南郑州');
