package com.lx.dao;


import com.lx.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherDao {
    // 获取老师
    List<Teacher> getTeacher();
    // 获取老师下的所有学生信息以及老师的信息
    Teacher getTeacherAndStudent(@Param("tid") int tid);

    Teacher getTeacherAndStudent2(@Param("tid") int tid);
}
