package com.lyh.service;

import com.lyh.bean.News;
import com.lyh.controller.result.Result;

/**
 * @author :liangyuhang1
 * @className :NewsService
 * @date :2023/6/12/20:20
 */
public interface NewsService {
    /**
     * 添加公告
     * @return
     */
    Result addNews(News news);

    /**
     * 获取所有公告
     * @return
     */
    Result getAllNews();

    /**
     * 按ID查询
     * @param id
     * @return
     */
    Result getById(int id);

    /**
     * 根据ID删除
     * @param id
     * @return
     */
    Result deleteById(int id);

    /**
     * 修改公告
     * @param news
     * @return
     */
    Result changeNews(News news);
}
