package com.lx.dao;

import com.lx.pojo.User;
import com.lx.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoTest03 {

    static Logger logger = Logger.getLogger(UserDao.class);

    @Test
    public void getUserList() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        List<User> userList = userDao.getUserList();

        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }

    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User user = userDao.getUserById(2);
        System.out.println(user);

        sqlSession.close();
    }

    @Test
    public void getUsersByLimit() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("pageIndex", 0);
        map.put("pageSize", 2);

        List<User> userList = userDao.getUsersByLimit(map);
        logger.info(userList.toArray().length);
        for (User user : userList) {
            logger.info(user);
        }

        sqlSession.close();
    }

    @Test
    public void testlog4j() {
        logger.info("info");
        logger.error("info");
        logger.debug("info");
    }
}
