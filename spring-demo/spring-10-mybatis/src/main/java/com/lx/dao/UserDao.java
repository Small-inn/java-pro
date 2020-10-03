package com.lx.dao;

import com.lx.pojo.User;

import java.util.List;

public interface UserDao {
    List<User> selectUser();
}
