package com.lx.config;

import com.lx.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// 本身就是一component，代表这个是一个配置类
@Configuration
@ComponentScan("com.lx.pojo")
public class UserConfig {
    // 这个方法的名字就相当于bean中的id属性，返回值是class属性
    @Bean
    public User getUser() {
        return new User();
    }
}
