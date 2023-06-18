package com.lyh.service.impl;

import com.lyh.bean.Info;
import com.lyh.bean.User;
import com.lyh.controller.result.Code;
import com.lyh.controller.result.Result;
import com.lyh.dao.InfoDao;
import com.lyh.dao.UserDao;
import com.lyh.service.InfoService;
import com.lyh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author :liangyuhang1
 * @className :UserServiceImpl
 * @date :2023/6/6/16:37
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private InfoDao infoDao;

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
     * 这是一个用户注册的接口
     * 用户注册
     * @param user
     * @return 
     */
    @Override
    public Result register(User user) {
        User user1 = userDao.getByUsername(user.getUsername());

        if (user1 == null) {
            // 账号未存在
            userDao.insert(user);
            User byUsername = userDao.getByUsername(user.getUsername());
            Info info = new Info();
            info.setUserId(byUsername.getId());
            //info.setBirthday(new Date());
            infoDao.insert(info);
            return new Result(Code.SAVE_OK, null, "注册成功");
        } else {
            // 账号已存在
            return new Result(Code.SAVE_ERR, null, "账号已存在, 请重试");
        }
    }

    /**
     * 根据Id删除用户
     * @param id
     * @return
     */
    @Override
    public Result deleteById(int id) {
        int i = userDao.deleteById(id);
        if (i == 1) {
            return new Result(Code.DELETE_OK, null, "删除用户成功");
        } else {
            return new Result(Code.DELETE_ERR, null, "删除用户失败");
        }
    }
}
