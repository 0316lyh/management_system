package com.lyh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyh.bean.Manage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author :liangyuhang1
 * @className :ManageDao
 * @date :2023/6/6/16:21
 */
@Mapper
public interface ManageDao extends BaseMapper<Manage> {
    @Select("select * from manage where username = #{username} and password = #{password}")
    Manage getByUsernameAndPassword(Manage manage);
}
