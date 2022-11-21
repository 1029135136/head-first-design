package com.ang.part10;


/**
 * @author: 于昂
 * @date: 2022/11/10
 **/
public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("投入硬币成功");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("无法退币,因为没有投入过硬币");
    }

    @Override
    public void tumCrank() {
        System.out.println("无法转动手柄,因为没有投入过硬币");
    }

    @Override
    public void dispense() {
        System.out.println("无法出糖,因为没有投入过硬币");
    }
}
