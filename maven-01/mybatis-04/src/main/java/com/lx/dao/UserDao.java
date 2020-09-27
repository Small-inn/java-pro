package com.lx.dao;


import com.lx.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {
    @Select("select * from mybatis.user")
    List<User> getUser();
    // 方法存在多个参数，所有参数前面必须加上@Param注解
    @Select("select * from user where id = #{id}")
    User getUserById(@Param("id") int id);
}
