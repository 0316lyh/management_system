package com.lyh.service;

import com.lyh.bean.Info;
import com.lyh.controller.result.Result;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author :liangyuhang1
 * @className :InfoService
 * @date :2023/6/7/15:56
 */
public interface InfoService {
    /**
     * 根据ID查用户信息
     * @param id
     * @return
     */
    Result getById(int id);

    /**
     * 根据登录用户Id(loginUserId)查信息
     * @param id
     * @return
     */
    Result getByLoginUserId(int id);

    /**
     * 更改用户信息
     * @param info
     * @return
     */
    Result changeInfo(Info info);

    /**
     * 获取所有员工信息
     * @return
     */
    Result getAll();

    /**
     * 根据Id删除用户信息
     * @param id
     * @return
     */
    Result deleteById(int id);

    /**
     * 根据分页查询员工信息
     * @return
     */
    Result getByPage(int pageSize, @PathVariable int currentPage);
}
