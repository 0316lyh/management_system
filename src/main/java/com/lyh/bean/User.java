package com.lyh.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author :liangyuhang1
 * @className :User
 * @date :2023/6/6/16:19
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String username;
    private String password;
    @TableField("isdeleted")
    private int isDeleted;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
