package com.lx.demo01;

public class Client {
    public static void main(String[] args) {
        // 房东出租房子
        Host host = new Host();
        // 代理， 中介帮房东租房子
        Proxy proxy = new Proxy(host);

        proxy.rent();
    }
}
