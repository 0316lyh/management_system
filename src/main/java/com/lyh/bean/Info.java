package com.lyh.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author :liangyuhang1
 * @className :Info
 * @date :2023/6/7/15:26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Info {
    private int id;
    @TableField("user_id")
    private int userId;
    String name;
    int age;
    private String sex;
    private String email;
    private String address;
    @TableField("phoneNum")
    private String phoneNum;
    private String avatar;  // 头像
    private String dept;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date birthday;

    public Info(int userId, String name, int age, String sex) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
