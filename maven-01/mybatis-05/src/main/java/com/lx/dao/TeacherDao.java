package com.lx.dao;

import com.lx.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TeacherDao {
    @Select("select * from teacher where id = #{tid}")
    Teacher getTeacher(@Param("tid") int tid);
}
