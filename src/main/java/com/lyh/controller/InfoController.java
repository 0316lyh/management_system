package com.lyh.controller;

import com.lyh.bean.Info;
import com.lyh.controller.result.Result;
import com.lyh.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author :liangyuhang1
 * @className :InfoController
 * @date :2023/6/7/21:04
 */
@RestController
@RequestMapping("/infos")
public class InfoController {
    @Autowired
    private InfoService infoService;

    /**
     * 根据ID查用户信息
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result getById(@PathVariable int id) {
        Result byId = infoService.getById(id);
        return byId;
    }

    /**
     * 更改用户信息
     * @param info
     * @return
     */
    @PutMapping
    public Result changeInfo(@RequestBody Info info) {
        Result result = infoService.changeInfo(info);
        return result;
    }
}
