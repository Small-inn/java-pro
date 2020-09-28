package com.lx.pojo;


import lombok.Data;

import java.util.List;

@Data
// 一对多处理
public class Teacher {
    private int id;
    private String name;
    private List<Student> students;
}
