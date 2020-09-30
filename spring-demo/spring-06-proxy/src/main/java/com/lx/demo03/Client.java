package com.lx.demo03;

public class Client {
    public static void main(String[] args) {
        Host host = new Host();

        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        pih.setRent(host);

        Rent proxt = (Rent) pih.getProxy();

        proxt.rent();
    }
}
