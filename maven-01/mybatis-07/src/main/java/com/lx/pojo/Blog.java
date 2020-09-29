package com.lx.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Blog {
    private int id;
    private String title;
    private String author;
    private Date create_time;
    private int views;
}
