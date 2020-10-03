package com.lx.dao;

import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserDaoImpl {
    private SqlSessionTemplate sqlSessionTemplate;

    public void setSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

//    public List<User> selectUser() {
//        UserDao mapper = sqlSessionTemplate.getMapper(UserDao.class);
//        return mapper.selectUser();
//    }
}
