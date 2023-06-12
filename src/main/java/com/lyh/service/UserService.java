package com.lyh.service;

import com.lyh.bean.User;
import com.lyh.controller.result.Result;

/**
 * @author :liangyuhang1
 * @className :UserService
 * @date :2023/6/6/16:35
 */
public interface UserService {
    /**
     * 用户登陆
     * @param user
     * @return
     */
    Result login(User user);

    /**
     * 用户注册
     * @param user
     * @return
     */
    Result register(User user);
}
