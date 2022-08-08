package com.ang.status.impl;

import com.ang.status.GumballMachine;
import com.ang.status.Status;

/**
 * @author: 于昂
 * @date: 2022/8/8
 **/
public class WinnerStatus implements Status {
    GumballMachine gumballMachine;

    public WinnerStatus(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() throws NoSuchMethodException {
        throw new NoSuchMethodException();
    }

    @Override
    public void ejectQuarter() throws NoSuchMethodException {
        throw new NoSuchMethodException();
    }

    @Override
    public boolean turnCrank() throws NoSuchMethodException {
        throw new NoSuchMethodException();
    }

    @Override
    public void dispense() {
        System.out.println("非常幸运,你得到了双倍的糖果!!!");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setStatus(gumballMachine.getSoldOutStatus());
        } else {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() == 0) {
                System.out.println("糖果机器空了");
                gumballMachine.setStatus(gumballMachine.getSoldOutStatus());
            } else {
                gumballMachine.setStatus(gumballMachine.getNoQuarterStatus());
            }
        }
    }

    @Override
    public String toString() {
        return "Winner";
    }
}
