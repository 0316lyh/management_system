package com.lyh.service.impl;

import com.lyh.bean.Message;
import com.lyh.controller.result.Code;
import com.lyh.controller.result.Result;
import com.lyh.dao.MessageDao;
import com.lyh.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author :liangyuhang1
 * @className :MessageServiceImpl
 * @date :2023/6/13/14:20
 */
@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageDao messageDao;

    /**
     * 获取所有留言
     *
     * @return
     */
    @Override
    public Result getAllMessage() {
        List<Message> messages = messageDao.selectByMap(null);
        if (messages != null) {
            return new Result(Code.GET_OK, messages, "查询成功");
        } else {
            return new Result(Code.GET_ERR, null, "查询失败");
        }
    }

    /**
     * 添加留言
     *
     * @return
     */
    @Override
    public Result addMessage(Message message) {
        int insert = messageDao.insert(message);
        if (insert == 1) {
            return new Result(Code.SAVE_OK, null, "添加留言成功");
        } else {
            return new Result(Code.SAVE_ERR, null, "添加留言失败");
        }
    }

    /**
     * 按Id删除留言
     *
     * @param id
     * @return
     */
    @Override
    public Result deleteById(int id) {
        int delete = messageDao.deleteById(id);
        if (delete == 1) {
            return new Result(Code.DELETE_OK, null, "删除成功");
        } else {
            return new Result(Code.DELETE_ERR, null, "删除失败...");
        }
    }
}
