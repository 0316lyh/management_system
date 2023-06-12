package com.lyh.service.impl;

import com.lyh.bean.Manage;
import com.lyh.bean.User;
import com.lyh.dao.ManageDao;
import com.lyh.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author :liangyuhang1
 * @className :ManageServiceImpl
 * @date :2023/6/6/16:37
 */
@Service
public class ManageServiceImpl implements ManageService {
    @Autowired
    private ManageDao manageDao;

    @Override
    public boolean login(Manage manage) {
        Manage manage1 = manageDao.getByUsernameAndPassword(manage);

        if (manage1 == null) {
                return false;
            } else {
                return true;
            }
    }
}
