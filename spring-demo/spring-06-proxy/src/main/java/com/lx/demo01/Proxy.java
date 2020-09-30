package com.lx.demo01;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Proxy implements Rent {
    private Host host;

    public void rent() {
        seeHouse();
        host.rent();
        fare();
    }

    public void seeHouse() {
        System.out.println("中介带你去看房");
    }
    public void fare() {
        System.out.println("中介收取中介费");
    }
}
