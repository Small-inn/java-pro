package com.lx.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// 等价于<bean id="user" class="com.lx.pojo.User" />
// 这个注解就是说这类被spring接管，注册到了容器中
// Conponent 组件
@Component
//@Scope("singleton")
public class User {
    // 等价于<property name="name" value="xixii" />
    // 属性注入值
    @Value("嘻嘻嘻嘻嘻嘻嘻")
    public String name;
}
