package com.lyh;

import com.lyh.bean.Info;
import com.lyh.bean.Manage;
import com.lyh.bean.News;
import com.lyh.bean.User;
import com.lyh.dao.InfoDao;
import com.lyh.dao.ManageDao;
import com.lyh.dao.NewsDao;
import com.lyh.dao.UserDao;
import com.lyh.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class Fruitshop3ApplicationTests {
    @Autowired
    UserDao userDao;
    @Autowired
    UserService userService;
    @Autowired
    ManageDao manageDao;
    @Autowired
    InfoDao infoDao;
    @Autowired
    NewsDao newsDao;

    @Test
    void contextLoads() {
        Manage manage = new Manage("admin", "admin");
        Manage byUsernameAndPassword = manageDao.getByUsernameAndPassword(manage);
        System.out.println(byUsernameAndPassword);
    }

    @Test
    void testInfoDao() {
        Info info = infoDao.selectById(1);
        System.out.println(info);
    }

    @Test
    void testDate() {
        List<News> news = newsDao.selectByMap(null);
        System.out.println(news);
    }

}
