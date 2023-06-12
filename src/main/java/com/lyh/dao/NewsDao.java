package com.lyh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyh.bean.News;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author :liangyuhang1
 * @className :NewsDao
 * @date :2023/6/12/20:19
 */
@Mapper
public interface NewsDao extends BaseMapper<News> {
}
