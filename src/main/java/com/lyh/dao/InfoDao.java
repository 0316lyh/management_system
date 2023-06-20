package com.lyh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyh.bean.Info;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author :liangyuhang1
 * @className :InfoDao
 * @date :2023/6/7/15:56
 */
@Mapper
public interface InfoDao extends BaseMapper<Info> {
    @Select("select * from info where user_id = #{id}")
    Info getByUserId(int id);


}
