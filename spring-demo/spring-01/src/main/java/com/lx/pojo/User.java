package com.lx.pojo;

import lombok.Data;

@Data
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name:" + name);
    }
}
