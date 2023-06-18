package com.lyh.service.impl;

import com.lyh.bean.Info;
import com.lyh.controller.result.Code;
import com.lyh.controller.result.Result;
import com.lyh.dao.InfoDao;
import com.lyh.service.InfoService;
import com.lyh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author :liangyuhang1
 * @className :InfoServiceImpl
 * @date :2023/6/7/15:56
 */
@Service
public class InfoServiceImpl implements InfoService {
    @Autowired
    private InfoDao infoDao;
    @Autowired
    private UserService userService;

    /**
     * 根据ID查用户信息
     *
     * @param id
     * @return
     */
    @Override
    public Result getById(int id) {
        Info info1 = infoDao.selectById(id);

        Info info = infoDao.getByUserId(info1.getUserId());
        if (info == null) {
            return new Result(Code.GET_ERR, null, "查询个人信息失败.");
        } else {
            return new Result(Code.GET_OK, info, "查询个人信息成功.");
        }
    }

    /**
     * 根据登录用户Id(loginUserId)查信息
     *
     * @param id
     * @return
     */
    @Override
    public Result getByLoginUserId(int id) {
        Info byUserId = infoDao.getByUserId(id);
        if (byUserId != null) {
            return new Result(Code.GET_OK, byUserId, "查询成功");
        } else {
            return new Result(Code.GET_ERR, null, "查询失败");
        }
    }

    /**
     * 更改用户信息
     *
     * @param info
     * @return
     */
    @Override
    public Result changeInfo(Info info) {
        int i = infoDao.updateById(info);
        if (i == 1) {
            return new Result(Code.UPDATE_OK, null, "更改信息成功");
        } else {
            return new Result(Code.UPDATE_ERR, null, "更改信息失败!");
        }
    }

    /**
     * 获取所有员工信息
     *
     * @return
     */
    @Override
    public Result getAll() {
        List<Map<String, Object>> maps = infoDao.selectMaps(null);
        if (maps != null) {
            return new Result(Code.GET_OK, maps, "查询成功");
        } else {
            return new Result(Code.GET_ERR, null, "查询失败");
        }
    }

    /**
     * 根据Id删除用户信息
     *
     * @param id
     * @return
     */
    @Override
    public Result deleteById(int id) {
        // 删除用户信息前先删除用户账号密码
        Info info = infoDao.selectById(id);
        Result result = userService.deleteById(info.getUserId());
        // 删除用户(账号密码)
        int i = infoDao.deleteById(info);
        if (i == 1 && result.getCode() == 20021) {
            return new Result(Code.DELETE_OK, null, "删除用户信息成功");
        } else {
            return new Result(Code.DELETE_ERR, null, "删除用户信息失败");
        }
    }
}
