package com.lx.dao;

import com.lx.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    // 查询全部用户
    List<User> getUserList();
    // 根据ID查询用户
    User getUserById(int id);
    // 新增
    int addUser(User user);
    // map 新增
    int addUser2(Map<String, Object> map);
    // 修改
    int updateUser(User user);
    // 删除
    int delUser(int id);
    //分页
    List<User> getUsersByLimit(Map<String, Integer> map);
}
