package com.lx.dao;

import com.lx.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogDao {
    // 插入
    int addBlog(Blog blog);
    // 查询
    List<Blog> queryBlogIF(Map map);
    // choose
    List<Blog> queryBlog(Map map);
    // 更新
    int updateBlog(Map map);
}
