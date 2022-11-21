package com.ang.part10;

/**
 * @author: 于昂
 * @date: 2022/11/10
 **/
public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("请稍等: 已经投过硬币了");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("无法退币, 因为已经转动过手柄");
    }

    @Override
    public void tumCrank() {
        System.out.println("请稍等, 已经转过手柄了");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() != 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
