package com.lx.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class Person {
    private String name;
    @Autowired
    private Dog dog;
    @Autowired
    private Cat cat;

}
