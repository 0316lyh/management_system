package com.lyh.service;

import com.lyh.bean.Manager;
import com.lyh.controller.result.Result;

/**
 * @author :liangyuhang1
 * @className :ManagerService
 * @date :2023/6/6/16:35
 */
public interface ManagerService {
    /**
     * 管理员登录
     * @param manager
     * @return
     */
    Result login(Manager manager);
}
