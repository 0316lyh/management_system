package com.lyh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyh.bean.Message;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author :liangyuhang1
 * @className :MessageDao
 * @date :2023/6/13/14:20
 */
@Mapper
public interface MessageDao extends BaseMapper<Message> {
    @Select("select content from message where id = #{id}")
    String getContentById(int id);
}
