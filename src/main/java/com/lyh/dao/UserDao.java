package com.lyh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyh.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author :liangyuhang1
 * @className :UserDao
 * @date :2023/6/6/16:22
 */
@Mapper
public interface UserDao extends BaseMapper<User> {
    @Select("select * from user where username = #{username} and password = #{password} and isdeleted = 0")
    User getByUsernameAndPassword(User user);

    @Select(("select * from user where username = #{username}"))
    User getByUsername(String username);
}
