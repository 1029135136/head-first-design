package com.ang.status.impl;

import com.ang.status.GumballMachine;
import com.ang.status.Status;

/**
 * @author: 于昂
 * @date: 2022/8/8
 **/
public class SoldOutStatus implements Status {
    GumballMachine gumballMachine;


    public SoldOutStatus(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("糖果已经全部售完");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("糖果已经全部售完");
    }

    @Override
    public boolean turnCrank() {
        System.out.println("糖果已经全部售完");
        return false;
    }

    @Override
    public void dispense() {
        System.out.println("糖果已经全部售完");
    }

    @Override
    public void load(int num) {
        gumballMachine.setCount(gumballMachine.getCount() + num);
        gumballMachine.setStatus(gumballMachine.getNoQuarterStatus());
        System.out.println("++++++++++++++++++++++++++");
        System.out.println("重新填充糖果成功");
        System.out.println("++++++++++++++++++++++++++");
    }

    @Override
    public String toString() {
        return "OutSold";
    }
}
