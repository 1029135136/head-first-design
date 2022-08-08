package com.ang.status.impl;

import com.ang.status.GumballMachine;
import com.ang.status.Status;

/**
 * @author: 于昂
 * @date: 2022/8/8
 **/
public class NoQuarterStatus implements Status {
    GumballMachine gumballMachine;


    public NoQuarterStatus(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        gumballMachine.setStatus(gumballMachine.getHasQuarterStatus());
        System.out.println("成功投入25美分硬币");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("没有投入硬币,无法返回!");
    }

    @Override
    public boolean turnCrank() {
        System.out.println("没有投入硬币,转动曲柄!");
        return false;
    }

    @Override
    public void dispense() {
        System.out.println("没有投入硬币,发放糖果!");
    }

    @Override
    public String toString() {
        return "NoQuarter";
    }
}
