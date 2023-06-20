package com.lyh.bean;

import lombok.Data;

import java.util.List;

/**
 * @author :liangyuhang1
 * @className :PageBean
 * @date :2023/6/20/15:57
 */
@Data
public class PageBean<T> {
    private int total;
    private List<T> list;
}
