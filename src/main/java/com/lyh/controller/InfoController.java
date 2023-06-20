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
        System.out.println(id);
        Result byId = infoService.getById(id);
        return byId;
    }

    /**
     * 根据登录用户Id(loginUserId)查信息
     *
     * @param loginUserId
     * @return
     */
    @GetMapping("/getByLoginUserId/{loginUserId}")
    public Result getByLoginUserId(@PathVariable int loginUserId) {
        Result byLoginUserId = infoService.getByLoginUserId(loginUserId);
        return byLoginUserId;
    }


    /**
     * 更改用户信息
     *
     * @param info
     * @return
     */
    @PutMapping
    public Result changeInfo(@RequestBody Info info) {
        Result result = infoService.changeInfo(info);
        return result;
    }


    /**
     * 获取所有员工信息
     *
     * @return
     */
    @GetMapping
    public Result getAll() {
        Result all = infoService.getAll();
        return all;
    }


    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable int id) {
        Result result = infoService.deleteById(id);
        return result;
    }

    /**
     * 根据分页查询员工信息
     *
     * @return
     */
    @GetMapping("/{pageSize}/{currentPage}")
    public Result getByPage(@PathVariable int pageSize, @PathVariable int currentPage) {
        Result byPage = infoService.getByPage(pageSize, currentPage);
        return byPage;
    }
}
