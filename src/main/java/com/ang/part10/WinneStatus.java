package com.ang.part10;

/**
 * @author: 于昂
 * @date: 2022/11/21
 **/
public class WinneStatus implements State {
    private GumballMachine gumballMachine;

    public WinneStatus(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("未许可的操作");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("未许可的操作");
    }

    @Override
    public void tumCrank() {
        System.out.println("未许可的操作");
    }

    @Override
    public void dispense() {
        System.out.println("幸运用户!");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        } else {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
