package com.ang.status;

/**
 * @author: 于昂
 * @date: 2022/8/8
 **/
public class GumballMachineMonitor {
    GumballMachine gumballMachine;

    public GumballMachineMonitor(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() {
        System.out.printf("位置: %s%n", gumballMachine.getLocation());
        System.out.printf("剩余数量: %d%n", gumballMachine.getCount());
        System.out.printf("状态: %s%n", gumballMachine.getStatus());
    }
}
