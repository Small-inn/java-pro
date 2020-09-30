package com.lx.demo04;

import com.lx.demo02.UserService;
import com.lx.demo02.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        // 真是角色
        UserServiceImpl userService = new UserServiceImpl();
        // 代理角色
        ProxyInvocationHandlerUtils pih = new ProxyInvocationHandlerUtils();
        // 设置需要代理的对象
        pih.setTarget(userService);
        // 动态生成代理类
        UserService proxy = (UserService) pih.getProxy();

        proxy.add();
    }
}
