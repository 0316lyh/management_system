package com.lyh.service.impl;

import com.lyh.bean.User;
import com.lyh.controller.result.Code;
import com.lyh.controller.result.Result;
import com.lyh.dao.UserDao;
import com.lyh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author :liangyuhang1
 * @className :UserServiceImpl
 * @date :2023/6/6/16:37
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    /**
     * 用户登陆
     * @param user
     * @return
     */
    @Override
    public Result login(User user) {
        User user1 = userDao.getByUsernameAndPassword(user);

        if (user1 == null) {
            return  new Result(Code.LOGIN_ERR,null,"账号或密码错误, 请重试");
        } else {
            return new Result(Code.LOGIN_OK, user1.getId(), "登陆成功~~");
        }


    }

    /**
     * 用户注册
     * @param user
     * @return
     */
    @Override
    public Result register(User user) {
        User user1 = userDao.getByUsername(user.getUsername());

        if (user1 != null) {
            return new Result(Code.SAVE_ERR, null, "账号已存在, 请重试");
        } else {
            int insert = userDao.insert(user);
            return new Result(Code.SAVE_OK, null, "注册成功");
        }
    }
}
