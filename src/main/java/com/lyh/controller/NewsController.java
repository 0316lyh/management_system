package com.lyh.controller;

import com.lyh.bean.News;
import com.lyh.controller.result.Result;
import com.lyh.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author :liangyuhang1
 * @className :NewsController
 * @date :2023/6/12/20:42
 */
@RestController
@RequestMapping("/news")
public class NewsController {
    @Autowired
    private NewsService newsService;

    /**
     * 获取所有公告
     * @return
     */
    @GetMapping
    public Result getAll() {
        Result allNews = newsService.getAllNews();
        return allNews;
    }

    /**
     * 添加公告
     * @param news
     * @return
     */
    @PostMapping
    public Result addNews(@RequestBody News news) {
        Result result = newsService.addNews(news);
        return result;
    }

    /**
     * 按ID查询
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result getById(@PathVariable int id) {
        Result byId = newsService.getById(id);
        return byId;
    }
}
