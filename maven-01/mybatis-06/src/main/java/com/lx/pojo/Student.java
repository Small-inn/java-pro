package com.lx.pojo;

import lombok.Data;

@Data
// 一对多
public class Student {
    private int id;
    private String name;
    private int tid;
}
