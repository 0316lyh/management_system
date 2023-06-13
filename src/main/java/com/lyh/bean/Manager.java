package com.lyh.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author :liangyuhang1
 * @className :Manager
 * @date :2023/6/6/16:17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Manager {
    private int id;
    private String username;
    private String password;

    public Manager(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
