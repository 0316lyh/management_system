package com.lyh.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author :liangyuhang1
 * @className :News
 * @date :2023/6/12/17:10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class News {
    private int id;
    private String name;
    private String content;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @TableField("addDate")
    private Date addDate;
}
