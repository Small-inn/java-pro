package com.lx.pojo;

import lombok.Data;

@Data
// 多对一
public class Student {
    private int id;
    private String name;
    private Teacher teacher;
}
