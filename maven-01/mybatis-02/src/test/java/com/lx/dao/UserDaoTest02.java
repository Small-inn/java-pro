package com.lx.dao;

import com.lx.pojo.User;
import com.lx.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest02 {
    @Test
    public void getUserList() {
        // 获得sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // 执行
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        List<User> userList = userDao.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }

}
