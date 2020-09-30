package com.lx.demo02;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userServicer = new UserServiceImpl();

        UserServiceProxy userServiceProxy = new UserServiceProxy();
        userServiceProxy.setUserService(userServicer);

        userServiceProxy.add();
    }
}
