package com.lyh.controller;

import com.lyh.bean.ChangePasswordBean;
import com.lyh.bean.User;
import com.lyh.controller.result.Code;
import com.lyh.controller.result.Result;
import com.lyh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author :liangyuhang1
 * @className :UserController
 * @date :2023/6/6/16:34
 */
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    /**
     * 用户登陆
     * @param user
     * @return
     */
    @PostMapping
    public Result login(@RequestBody User user) {
        Result login = userService.login(user);
        return login;
    }

    /**
     * 用户注册
     * @param user
     * @return
     */
    @PostMapping("/register")
    public Result register(@RequestBody User user) {
        Result register = userService.register(user);
        return  register;
    }

    /**
     * 修改密码
     * @param changePasswordBean
     * @return
     */
    @PutMapping("/changePassword")
    public Result changePassword(@RequestBody ChangePasswordBean changePasswordBean) {
        Result result = userService.changePassword(changePasswordBean);
        return result;
    }
}