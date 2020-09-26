package com.lx.dao;

import com.lx.pojo.User;
import com.lx.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoTest {
    @Test
    public void Test() {
        // 获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlsession();
        // 执行
        // 方式一
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.getUserList();
        // 方式二 不推荐
        // List<User> userList = sqlSession.selectList("com.lx.dao.UserDao.getUserList");
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlsession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User user = userDao.getUserById(5);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void addUser() {
        SqlSession sqlSession = MybatisUtils.getSqlsession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        int i = userDao.addUser(new User(4, "哈哈", "234"));
        if (i > 0) {
            System.out.println("插入成功");
        }
        // 提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void addUser2() {
        SqlSession sqlSession = MybatisUtils.getSqlsession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userId", 5);
        map.put("userName", "嘿嘿");
        map.put("userPassword", "567");
        int i = userDao.addUser2(map);
        if (i > 0) {
            System.out.println("插入成功");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateUser() {
        SqlSession sqlSession = MybatisUtils.getSqlsession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        int i = userDao.updateUser(new User(2, "呵呵", "345"));
        if (i > 0) {
            System.out.println("修改成功");
        }
        // 提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void delUser() {
        SqlSession sqlSession = MybatisUtils.getSqlsession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        int i = userDao.delUser(1);
        if (i > 0) {
            System.out.println("删除成功");
        }
        // 提交事务
        sqlSession.commit();
        sqlSession.close();
    }
}
