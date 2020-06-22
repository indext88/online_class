/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 80012
 Source Host           : localhost:3306
 Source Schema         : online_class

 Target Server Type    : MySQL
 Target Server Version : 80012
 File Encoding         : 65001

 Date: 16/12/2019 11:42:15
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

create database online_class;
use online_class;

-- ----------------------------
-- Table structure for classtime
-- ----------------------------
DROP TABLE IF EXISTS `classtime`;
CREATE TABLE `classtime`  (
  `time_id` int(11) NOT NULL AUTO_INCREMENT,
  `course_cno` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `class_weekend` int(8) NULL DEFAULT NULL,
  `class_time` int(8) NULL DEFAULT NULL,
  PRIMARY KEY (`time_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 22 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of classtime
-- ----------------------------
INSERT INTO `classtime` VALUES (1, '0001', 3, 4);
INSERT INTO `classtime` VALUES (2, '0011', 3, 2);
INSERT INTO `classtime` VALUES (3, '0002', 2, 3);
INSERT INTO `classtime` VALUES (4, '1012', 1, 4);
INSERT INTO `classtime` VALUES (5, '1013', 1, 5);
INSERT INTO `classtime` VALUES (7, '1103', 4, 3);
INSERT INTO `classtime` VALUES (8, '1011', 5, 4);
INSERT INTO `classtime` VALUES (9, '2011', 2, 5);
INSERT INTO `classtime` VALUES (10, '0301', 3, 5);
INSERT INTO `classtime` VALUES (17, '1102', 2, 1);
INSERT INTO `classtime` VALUES (20, '4568', 2, 4);
INSERT INTO `classtime` VALUES (21, 'da', 1, 2);

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course`  (
  `course_id` int(11) NOT NULL AUTO_INCREMENT,
  `course_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `course_cno` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `course_information` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `course_number` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`course_id`) USING BTREE,
  INDEX `course_cno`(`course_cno`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 29 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES (1, '语文', '0001', '一个文学的语言', 0);
INSERT INTO `course` VALUES (2, '高数', '0011', '数学要求高精确低错误', 0);
INSERT INTO `course` VALUES (3, '英语', '0002', '英语好啊，强啊', 0);
INSERT INTO `course` VALUES (4, 'java', '1012', '计算机编程基础', 0);
INSERT INTO `course` VALUES (5, 'C语言', '1013', '计算机编程入门', 0);
INSERT INTO `course` VALUES (7, 'CSS', '1103', '界面前端样式', 0);
INSERT INTO `course` VALUES (14, 'CSS3', '1011', '前端样式学习', 0);
INSERT INTO `course` VALUES (16, 'HTML 5', '2011', '跨平台界面实现', 0);
INSERT INTO `course` VALUES (17, 'python', '0301', '人工智能', 0);
INSERT INTO `course` VALUES (24, '微信小程序开发', '1102', '微信界面嵌入式开发', 0);
INSERT INTO `course` VALUES (27, 'BootStrap', '4568', '轻量级前端框架', 0);
INSERT INTO `course` VALUES (28, 'VUE', 'da', 'asd', 0);

-- ----------------------------
-- Table structure for score
-- ----------------------------
DROP TABLE IF EXISTS `score`;
CREATE TABLE `score`  (
  `score_id` int(11) NOT NULL AUTO_INCREMENT,
  `student_sno` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `course_cno` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `teacher_tno` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `score` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`score_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 18 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of score
-- ----------------------------
INSERT INTO `score` VALUES (1, '20170235', '0001', '1001', 88);
INSERT INTO `score` VALUES (2, '20170235', '0011', '1010', 80);
INSERT INTO `score` VALUES (3, '20170239', '0001', '1001', 80);
INSERT INTO `score` VALUES (4, '20170003', '1102', '1010', 86);
INSERT INTO `score` VALUES (5, '20170003', '1103', '1012', 93);
INSERT INTO `score` VALUES (6, '20170003', '1013', '2212', 59);
INSERT INTO `score` VALUES (8, '20171115', '1103', '1012', 89);
INSERT INTO `score` VALUES (10, '20170235', '1013', '1004', 100);
INSERT INTO `score` VALUES (11, '20170235', '1103', '1011', 100);
INSERT INTO `score` VALUES (12, '20170235', '0002', '2012', 0);
INSERT INTO `score` VALUES (13, '20170235', '1102', '2312', 0);
INSERT INTO `score` VALUES (14, '20170235', '1012', '1005', 0);
INSERT INTO `score` VALUES (15, '20170003', '0001', '1001', 0);
INSERT INTO `score` VALUES (16, '20170003', '0011', '1010', 0);
INSERT INTO `score` VALUES (17, '20170003', '0002', '2012', 0);

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `student_id` int(11) NOT NULL AUTO_INCREMENT,
  `student_name` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `student_sno` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `student_age` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `student_data` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `student_phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `student_address` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `student_class` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`student_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 18 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, 'lp', '20170235', '30', '1989-10-17', '13556989456', '四川成都', '软件5班');
INSERT INTO `student` VALUES (5, 'xw', '20170239', '1', '2018-06-23', '13529465698', 'asdas', '软件4班');
INSERT INTO `student` VALUES (7, 'lk', '20170535', '20', '1998-11-17', '13598768569', 'fsdfsdf', '软件5班');
INSERT INTO `student` VALUES (8, 'zys', '20170135', '2', '2017-08-05', '17798768569', '四川成都', '软件4班');
INSERT INTO `student` VALUES (9, 'xw', '20170158', '21', '1998-08-05', '17765489685', '四川成都温江', '软件3班');
INSERT INTO `student` VALUES (10, 'yt', '20171115', '21', '1998-09-05', '17765483659', '四川成都温江', '软件3班');
INSERT INTO `student` VALUES (11, 'yzw', '20171110', '22', '1997-09-05', '13765483659', '四川成都巴中', '软件1班');
INSERT INTO `student` VALUES (12, 'zyp', '20170015', '22', '1997-09-05', '13709058698', '四川成都巴中', '软件1班');
INSERT INTO `student` VALUES (13, 'hj', '20171525', '22', '1997-11-05', '13709058698', '四川洛枳', '软件2班');
INSERT INTO `student` VALUES (14, 'sw', '20170003', '21', '1998-11-05', '13782659253', '四川洛枳', '软件2班');
INSERT INTO `student` VALUES (15, '12345678', '12345678', '21', '1998-01-01', '15982014077', 'asdadasd', 'qwewq');
INSERT INTO `student` VALUES (16, '20170898', '20170898', '21', '1998-01-01', '15982014077', 'asdadasd', 'qwewq');
INSERT INTO `student` VALUES (17, '20170002', '20170002', '22', '1997-08-07', '13789658256', '四川温江', '运维2班');

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher`  (
  `teacher_id` int(11) NOT NULL AUTO_INCREMENT,
  `teacher_name` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `teacher_tno` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `teacher_age` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `teacher_data` date NULL DEFAULT NULL,
  `teacher_phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `teacher_address` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `teacher_course_id` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`teacher_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES (1, '刘飞', '1001', '35', '1984-10-07', '13578943654', '四川成都', '0001');
INSERT INTO `teacher` VALUES (2, '张芳', '1010', '35', '1983-12-10', '17789654562', '四川德阳', '0011');
INSERT INTO `teacher` VALUES (3, '张雨林', '1003', '30', '1989-11-02', '17762536398', '四川德阳', '0002');
INSERT INTO `teacher` VALUES (4, 'lp', '1004', '30', '1989-11-10', '17565398456', '四川成都', '1013');
INSERT INTO `teacher` VALUES (5, 'xw', '1005', '35', '1984-08-06', '13706598634', '四川绵阳', '1012');
INSERT INTO `teacher` VALUES (7, 'ly', '1011', '36', '1983-08-01', '17765973265', '成都温江', '1103');
INSERT INTO `teacher` VALUES (8, 'nl', '1012', '35', '1984-08-01', '13765973265', '湖南张家界', '1103');
INSERT INTO `teacher` VALUES (9, '何兰', '2012', '29', '1990-08-01', '13765954369', '四川成都温江', '0002');
INSERT INTO `teacher` VALUES (10, '张兰', '2112', '26', '1993-08-01', '13765954569', '四川成都郫县', '1013');
INSERT INTO `teacher` VALUES (11, '魅蓝', '2212', '28', '1991-08-01', '13798762315', '山西太原', '1013');
INSERT INTO `teacher` VALUES (12, '赵霞', '2312', '27', '1992-08-01', '17798152315', '山东广西', '1102');
INSERT INTO `teacher` VALUES (13, 'Fm', '2323', '25', '1994-09-01', '17798151253', '广西', '0301');
INSERT INTO `teacher` VALUES (14, 'kjhkj', '12346', '21', '1998-01-01', '15982014077', 'dadasdad', '131654');
INSERT INTO `teacher` VALUES (15, 'dfadfa', '9999', '21', '1998-01-01', '15982014077', 'ffafafa', '4567');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_type` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 34 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'admin', 'dd2c1b868850396c4af22bcb54e73795', '管理员');
INSERT INTO `user` VALUES (4, '20170235', '9f81d20a9a1d77195dc7537c87ef9b3b', '学生');
INSERT INTO `user` VALUES (5, '20170239', '9d6177a0ec7a93bcfee1ec47c439eab5', '学生');
INSERT INTO `user` VALUES (7, '20170535', '9f81d20a9a1d77195dc7537c87ef9b3b', '学生');
INSERT INTO `user` VALUES (8, '1001', '9f81d20a9a1d77195dc7537c87ef9b3b', '教师');
INSERT INTO `user` VALUES (9, '1010', '9f81d20a9a1d77195dc7537c87ef9b3b', '教师');
INSERT INTO `user` VALUES (10, '1003', '9f81d20a9a1d77195dc7537c87ef9b3b', '教师');
INSERT INTO `user` VALUES (11, '1004', '9f81d20a9a1d77195dc7537c87ef9b3b', '教师');
INSERT INTO `user` VALUES (12, '1005', '9f81d20a9a1d77195dc7537c87ef9b3b', '教师');
INSERT INTO `user` VALUES (14, '20170135', '9f81d20a9a1d77195dc7537c87ef9b3b', '学生');
INSERT INTO `user` VALUES (15, '20170158', '9f81d20a9a1d77195dc7537c87ef9b3b', '学生');
INSERT INTO `user` VALUES (16, '20171115', '9f81d20a9a1d77195dc7537c87ef9b3b', '学生');
INSERT INTO `user` VALUES (17, '20171110', '9f81d20a9a1d77195dc7537c87ef9b3b', '学生');
INSERT INTO `user` VALUES (18, '20170015', '5e83596334400305514565ee16b9106d', '学生');
INSERT INTO `user` VALUES (19, '20171525', '9f81d20a9a1d77195dc7537c87ef9b3b', '学生');
INSERT INTO `user` VALUES (20, '20170003', '9f81d20a9a1d77195dc7537c87ef9b3b', '学生');
INSERT INTO `user` VALUES (21, '1011', '9f81d20a9a1d77195dc7537c87ef9b3b', '教师');
INSERT INTO `user` VALUES (22, '1012', '9f81d20a9a1d77195dc7537c87ef9b3b', '教师');
INSERT INTO `user` VALUES (23, '2012', '9f81d20a9a1d77195dc7537c87ef9b3b', '教师');
INSERT INTO `user` VALUES (24, '2112', '9f81d20a9a1d77195dc7537c87ef9b3b', '教师');
INSERT INTO `user` VALUES (25, '2212', '9f81d20a9a1d77195dc7537c87ef9b3b', '教师');
INSERT INTO `user` VALUES (26, '2312', '9f81d20a9a1d77195dc7537c87ef9b3b', '教师');
INSERT INTO `user` VALUES (28, '2323', '9f81d20a9a1d77195dc7537c87ef9b3b', '教师');
INSERT INTO `user` VALUES (29, '12345678', '9f81d20a9a1d77195dc7537c87ef9b3b', '学生');
INSERT INTO `user` VALUES (30, '20170898', '9f81d20a9a1d77195dc7537c87ef9b3b', '学生');
INSERT INTO `user` VALUES (31, '12346', '9f81d20a9a1d77195dc7537c87ef9b3b', '教师');
INSERT INTO `user` VALUES (32, '9999', '9f81d20a9a1d77195dc7537c87ef9b3b', '教师');
INSERT INTO `user` VALUES (33, '20170002', '9f81d20a9a1d77195dc7537c87ef9b3b', '学生');

SET FOREIGN_KEY_CHECKS = 1;
