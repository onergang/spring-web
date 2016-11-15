/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : mydb

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2016-10-28 11:29:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS users;
CREATE TABLE users (
  userId int(11) NOT NULL AUTO_INCREMENT,
  userName varchar(255) DEFAULT NULL,
  age int(11) DEFAULT NULL,
  sex int(2) DEFAULT NULL,
  birthday date DEFAULT NULL,
  mobile varchar(255) DEFAULT NULL,
  address varchar(255) DEFAULT NULL,
  creator int(11) DEFAULT NULL,
  createTime datetime DEFAULT NULL,
  updator int(11) DEFAULT NULL,
  updateTime datetime DEFAULT NULL,
  isDel int(2) DEFAULT NULL,
  password varchar(255) DEFAULT NULL,
  PRIMARY KEY (userId)
) ENGINE=InnoDB AUTO_INCREMENT=60 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO users VALUES ('25', 'zhangsan', '20', '0', '1998-12-23', '15535894567', '北京朝阳呼家楼', null, '2016-08-23 17:55:19', null, null, '0', '31');
INSERT INTO users VALUES ('26', 'liming', '29', '0', '1998-12-23', '18796548562', '北京朝阳呼家楼', null, '2016-08-25 17:55:23', null, null, '0', '3');
INSERT INTO users VALUES ('53', '张三', null, '0', '1995-12-12', null, '北京', null, null, null, null, '0', 'lisi');
INSERT INTO users VALUES ('54', 'liming', null, '0', '1982-12-12', null, '山西', null, null, null, null, '0', '123');
INSERT INTO users VALUES ('56', '黎明明', null, '0', '1908-12-12', null, '河南', null, null, null, null, '0', '133');
INSERT INTO users VALUES ('58', '123', null, '0', '1908-12-12', null, '312', null, null, null, null, '0', '12');
INSERT INTO users VALUES ('59', '123', null, '0', '1908-12-12', null, '312', null, null, null, null, '0', '3333');
