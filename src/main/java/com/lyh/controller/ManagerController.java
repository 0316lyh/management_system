package com.lyh.controller;

import com.lyh.bean.Manager;
import com.lyh.controller.result.Code;
import com.lyh.controller.result.Result;
import com.lyh.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :liangyuhang1
 * @className :ManagerController
 * @date :2023/6/6/16:34
 */
@RestController
@RequestMapping("/managers")
public class ManagerController {
    @Autowired
    ManagerService managerService;

    @PostMapping
    public Result login(@RequestBody Manager manage) {
        Result login = managerService.login(manage);
        return login;
    }
}
