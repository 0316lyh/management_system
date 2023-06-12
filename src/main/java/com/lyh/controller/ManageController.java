package com.lyh.controller;

import com.lyh.bean.Manage;
import com.lyh.controller.result.Code;
import com.lyh.controller.result.Result;
import com.lyh.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :liangyuhang1
 * @className :ManageController
 * @date :2023/6/6/16:34
 */
@RestController
@RequestMapping("/manage")
public class ManageController {
    @Autowired
    ManageService manageService;

    @PostMapping
    public Result login(@RequestBody Manage manage) {
        boolean login = manageService.login(manage);
        if (login) {
            return new Result(Code.GET_OK, null , "登陆成功");
        } else {
            return new Result(Code.GET_ERR, null, "账号或密码错误");
        }
    }
}
