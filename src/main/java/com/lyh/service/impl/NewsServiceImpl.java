package com.lyh.service.impl;

import com.lyh.bean.News;
import com.lyh.controller.result.Code;
import com.lyh.controller.result.Result;
import com.lyh.dao.NewsDao;
import com.lyh.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author :liangyuhang1
 * @className :NewsServiceImpl
 * @date :2023/6/12/20:20
 */
@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    private NewsDao newsDao;

    /**
     * 添加公告
     *
     * @return
     */
    @Override
    public Result addNews(News news) {
        news.setAddDate(new Date());
        int insert = newsDao.insert(news);
        if (insert == 1) {
            return new Result(Code.SAVE_OK, null, "添加信息成功");
        } else {
            return new Result(Code.SAVE_ERR, null, "添加信息失败");
        }
    }

    /**
     * 获取所有公告
     *
     * @return
     */
    @Override
    public Result getAllNews() {
        List<News> news = newsDao.selectByMap(null);
        if (news != null) {
            return new Result(Code.GET_OK, news, "获取所有公告成功");
        } else {
            return new Result(Code.GET_ERR, null, "获取所有公告失败");
        }
    }

    /**
     * 按ID查询
     *
     * @param id
     * @return
     */
    @Override
    public Result getById(int id) {
        News news = newsDao.selectById(id);
        if (news != null) {
            return new Result(Code.GET_OK, news, "查询成功");
        } else {
            return new Result(Code.GET_ERR, null, "查询失败");
        }
    }
}
