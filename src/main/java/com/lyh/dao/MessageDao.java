package com.lyh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyh.bean.Message;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author :liangyuhang1
 * @className :MessageDao
 * @date :2023/6/13/14:20
 */
@Mapper
public interface MessageDao extends BaseMapper<Message> {
}
