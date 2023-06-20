package com.lyh.bean;

import lombok.Data;

/**
 * @author :liangyuhang1
 * @className :ChangePasswordBean
 * @date :2023/6/20/20:30
 */
@Data
public class ChangePasswordBean {
    private String oldPassword;
    private String newPassword;
    private int loginUserId;
}
