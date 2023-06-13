package com.lyh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyh.bean.Manager;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author :liangyuhang1
 * @className :ManagerDao
 * @date :2023/6/6/16:21
 */
@Mapper
public interface ManagerDao extends BaseMapper<Manager> {
    @Select("select * from manager where username = #{username} and password = #{password}")
    Manager getByUsernameAndPassword(Manager manager);
}
