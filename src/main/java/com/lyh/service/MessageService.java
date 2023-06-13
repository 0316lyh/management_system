package com.lyh.service;

import com.lyh.bean.Message;
import com.lyh.controller.result.Result;

/**
 * @author :liangyuhang1
 * @className :MessageService
 * @date :2023/6/13/14:20
 */
public interface MessageService {
    /**
     * 获取所有留言
     * @return
     */
    Result getAllMessage();

    /**
     * 添加留言
     * @return
     */
    Result addMessage(Message message);

    /**
     * 按Id删除留言
     * @param id
     * @return
     */
    Result deleteById(int id);
}
