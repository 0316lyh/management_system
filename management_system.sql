/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 50740 (5.7.40)
 Source Host           : localhost:3306
 Source Schema         : management_system

 Target Server Type    : MySQL
 Target Server Version : 50740 (5.7.40)
 File Encoding         : 65001

 Date: 28/06/2023 13:58:25
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for info
-- ----------------------------
DROP TABLE IF EXISTS `info`;
CREATE TABLE `info`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NULL DEFAULT NULL COMMENT '用户号码id',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `age` int(255) NULL DEFAULT NULL COMMENT '年龄',
  `sex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地址',
  `phoneNum` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电话',
  `avatar` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '头像',
  `dept` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '部门',
  `birthday` date NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 24 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of info
-- ----------------------------
INSERT INTO `info` VALUES (1, 1, '梁宇航111', 20, '男', 'lyh0316@gmail.com', '广东省湛江市', '13590016606', '/public/image/avatar/1.jpg', '维修部', '2003-07-01');
INSERT INTO `info` VALUES (2, 2, '梁宇航22', 21, '女', '2222@gamil.com', '广东省茂名市', '13590016606', '/public/image/avatar/u=4143007323,1329348336&fm=253&fmt=auto&app=138&f=JPEG.webp', '维修部', '2002-03-16');
INSERT INTO `info` VALUES (3, 3, '梁宇航333', 21, '女', '3333@gami.com', '广东省湛江市', '12345678910', '/public/image/avatar/3.jpg', '开发部', '2002-06-21');
INSERT INTO `info` VALUES (8, 36, '梁宇航6606', 26, '男', 'xxx@qq.com', '广东省茂名市', '15235478523', '/public/image/avatar/6606.png', '人事部', '1997-06-06');
INSERT INTO `info` VALUES (9, 37, '梁宇航7707', 31, '男', '7707@gmail.com', '7707地址', '14752836925', '/public/image/avatar/u=4278216090,542028317&fm=253&fmt=auto&app=138&f=JPEG.webp', '7707部门', '1992-07-07');
INSERT INTO `info` VALUES (11, 39, '梁宇航8808', 30, '男', '8808@gmail.com', '8808地址', '13256987420', '/public/image/avatar/u=1480477398,122818281&fm=253&fmt=auto&app=138&f=JPEG.webp', '8808部门', '1993-08-08');
INSERT INTO `info` VALUES (12, 40, '梁宇航999', 36, '男', '9999@gmail.com', '福建省福州市', '13590014978', '/public/image/avatar/u=303985922,2393202422&fm=253&fmt=auto&app=138&f=JPEG.webp', '维修部', '1987-06-21');
INSERT INTO `info` VALUES (13, 41, '梁宇航10', 24, '男', '20425410@gami.com', '广东省东莞市', '12345678910', '/public/image/avatar/u=303985922,2393202422&fm=253&fmt=auto&app=138&f=JPEG.webp', '开发部', '1999-06-22');
INSERT INTO `info` VALUES (17, 45, '张三', 21, '男', 'zhangsan@qq.com', '浙江省杭州市', '15234567218', '/public/image/avatar/u=3304822103,1045554583&fm=253&fmt=auto&app=138&f=JPEG.webp', '维修部', '2002-06-12');
INSERT INTO `info` VALUES (18, 46, '李四', 25, '男', 'lisi@163.com', '广东省深圳市', '13542514263', '/public/image/avatar/u=2567150411,4263054107&fm=253&fmt=auto&app=138&f=JPEG.webp', '人事部', '1998-06-12');
INSERT INTO `info` VALUES (19, 47, '王五', 18, '女', 'wangwu@outlook.com', '广东省佛山市', '15347525632', '/public/image/avatar/u=1793195527,385418102&fm=253&fmt=auto&app=138&f=JPEG.webp', '人事部', '2005-06-04');
INSERT INTO `info` VALUES (20, 48, '赵六', 26, '女', 'zhaoliu@qq.com', '广东省湛江市', '13256875246', '/public/image/avatar/u=3262615199,1051771326&fm=253&fmt=auto&app=138&f=JPEG.webp', '财政部', '1997-06-13');
INSERT INTO `info` VALUES (21, 49, '七七', 22, '男', 'qiqi@163.com', '福建省漳州市', '15235789524', '/public/image/avatar/u=2918884674,389365218&fm=253&fmt=auto&app=138&f=JPEG.webp', '财政部', '2001-03-08');
INSERT INTO `info` VALUES (22, 50, '八八', 30, '女', 'baba@', '四川省成都市', '13520142571', '/public/image/avatar/u=1000906232,3488587097&fm=253&fmt=auto&app=138&f=JPEG.webp', '财政部', '1993-03-18');

-- ----------------------------
-- Table structure for manager
-- ----------------------------
DROP TABLE IF EXISTS `manager`;
CREATE TABLE `manager`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of manager
-- ----------------------------
INSERT INTO `manager` VALUES (1, 'admin', 'admin');

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 51 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of message
-- ----------------------------
INSERT INTO `message` VALUES (39, '梁宇航1', '13590016606', '留意1');
INSERT INTO `message` VALUES (40, '张三', '13590017707', '留意from张三...');
INSERT INTO `message` VALUES (41, '李四', '13590018808', '留言from李四...');
INSERT INTO `message` VALUES (44, '王五', '13590099059', '留言from王五...');
INSERT INTO `message` VALUES (45, '赵六', '13590012060', '留言from赵六');
INSERT INTO `message` VALUES (49, '梁宇航11', '6606', '留言from梁宇航111');

-- ----------------------------
-- Table structure for news
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `content` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `addDate` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 27 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of news
-- ----------------------------
INSERT INTO `news` VALUES (20, '在中央党校建校90周年上的讲话', '　今天，我们在这里集会，庆祝中央党校建校90周年，同时举行中央党校2023年春季学期开学典礼。首先，我代表党中央向中央党校（国家行政学院）全体教职工和学员，向全国党校（行政学院）系统的同志们致以热烈的祝贺和诚挚的问候！\n\n　　中央党校从1933年创办至今，已经走过90年光辉历程。90年来，中央党校为培养党的干部、推动党的思想理论建设、服务党和人民事业作出了重大贡献，积累了许多宝贵经验。回顾历史，党校始终不变的初心就是为党育才、为党献策。新时代新征程，各级党校要坚守这个初心，锐意进取、奋发有为，为全面建设社会主义现代化国家、全面推进中华民族伟大复兴作出新的贡献。\n11\n\n', '2023-06-18 14:12:27');
INSERT INTO `news` VALUES (21, '在全国党校工作会议上的讲话', '这次全国党校工作会议，是党中央召开的一次十分重要的会议。主要任务是，分析研究党校工作面临的形势和任务，贯彻落实《中共中央关于加强和改进新形势下党校工作的意见》，部署当前和今后一个时期党校工作，努力开创党校工作新局面。\n\n　　上次全国党校工作会议是2008年召开的，那时我担任中央党校校长，我在讲话中概括了改革开放30年党校工作取得的7个方面成绩和进步，提出3个方面规律性认识。2012年7月，我们召开了全国党校校长会议，我在讲话中概括了党的十七大以来党校工作取得的8个方面成绩和进步，概括了9个方面经验。党的十八大以来，党校工作取得了新成绩、积累了新经验。今天的会议主要是分析形势、研究问题、部署工作，成绩和经验就不多讲了，我想围绕坚持党校姓党这个党校工作的根本原则谈一些看法。', '2023-06-16 17:35:46');
INSERT INTO `news` VALUES (25, '习近平：毫不动摇坚持和发展中国特色社会主义', '新华社北京1月5日电（记者 徐京跃 霍小光）新进中央委员会的委员、候补委员学习贯彻党的十八大精神研讨班5日在中央党校开班。中共中央总书记、中共中央军委主席习近平在开班式上发表重要讲话。他强调，道路问题是关系党的事业兴衰成败第一位的问题，道路就是党的生命。中国特色社会主义，是科学社会主义理论逻辑和中国社会发展历史逻辑的辩证统一，是根植于中国大地、反映中国人民意愿、适应中国和时代发展进步要求的科学社会主义，是全面建成小康社会、加快推进社会主义现代化、实现中华民族伟大复兴的必由之路。', '2023-06-16 17:38:43');
INSERT INTO `news` VALUES (26, '习近平：在全党大兴学习之风 依靠学习和实践走向未来', '中共中央党校3月1日举行建校80周年庆祝大会暨2013年春季学期开学典礼。中共中央总书记、中共中央军委主席习近平出席并发表重要讲话。他强调，好学才能上进。中国共产党人依靠学习走到今天，也必然要依靠学习走向未来。我们的干部要上进，我们的党要上进，我们的国家要上进，我们的民族要上进，就必须大兴学习之风，坚持学习、学习、再学习，坚持实践、实践、再实践。全党同志特别是各级领导干部都要有加强学习的紧迫感，都要一刻不停地增强本领。12', '2023-06-22 13:50:07');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `isdeleted` int(1) NULL DEFAULT 0 COMMENT '0没被删除  1被删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 52 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'lyh', '020316', 0);
INSERT INTO `user` VALUES (2, 'lyh2', '020316', 0);
INSERT INTO `user` VALUES (3, 'lyh3', '020316', 0);
INSERT INTO `user` VALUES (32, 'lyh4', '020316', 0);
INSERT INTO `user` VALUES (36, 'lyh6606', '6606', 0);
INSERT INTO `user` VALUES (37, 'lyh7707', '7707', 0);
INSERT INTO `user` VALUES (39, 'lyh8808', '8808', 0);
INSERT INTO `user` VALUES (45, 'zhangsan', '6606', 0);
INSERT INTO `user` VALUES (46, 'lisi', '6606', 0);
INSERT INTO `user` VALUES (47, 'wangwu', '6606', 0);
INSERT INTO `user` VALUES (48, 'zhaoliu', '6606', 0);
INSERT INTO `user` VALUES (49, 'qiqi', '6606', 0);
INSERT INTO `user` VALUES (50, 'baba', '6606', 0);

SET FOREIGN_KEY_CHECKS = 1;
