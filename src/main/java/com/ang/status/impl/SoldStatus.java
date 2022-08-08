package com.ang.status.impl;

import com.ang.status.GumballMachine;
import com.ang.status.Status;

/**
 * @author: 于昂
 * @date: 2022/8/8
 **/
public class SoldStatus implements Status {
    GumballMachine gumballMachine;

    public SoldStatus(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("正在出糖果,请稍后");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("正在出糖果,请稍后");
    }

    @Override
    public boolean turnCrank() {
        System.out.println("正在出糖果,请稍后");
        return true;
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        System.out.println("发放糖果成功");
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setStatus(gumballMachine.getNoQuarterStatus());
        } else {
            System.out.println("机器里的糖果卖完了");
            gumballMachine.setStatus(gumballMachine.getSoldOutStatus());
        }
    }

    @Override
    public String toString() {
        return "Sold";
    }
}
