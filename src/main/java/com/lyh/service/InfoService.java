package com.lyh.service;

import com.lyh.bean.Info;
import com.lyh.controller.result.Result;

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
     * 更改用户信息
     * @param info
     * @return
     */
    Result changeInfo(Info info);

}
