package com.lyh.service.impl;

import com.lyh.bean.Manager;
import com.lyh.controller.result.Code;
import com.lyh.controller.result.Result;
import com.lyh.dao.ManagerDao;
import com.lyh.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author :liangyuhang1
 * @className :ManagerServiceImpl
 * @date :2023/6/6/16:37
 */
@Service
public class ManagerServiceImpl implements ManagerService {
    @Autowired
    private ManagerDao managerDao;

    /**
     * 管理员登录
     * @param manager
     * @return
     */
    @Override
    public Result login(Manager manager) {
        Manager manager1 = managerDao.getByUsernameAndPassword(manager);
        if (manager1 != null) {
            return new Result(Code.LOGIN_OK, manager1, "登陆成功~");
        } else {
            return new Result(Code.LOGIN_ERR, null, "账号或密码错误, 请重试");
        }
    }
}
