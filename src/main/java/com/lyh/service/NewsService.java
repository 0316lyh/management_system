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
}
