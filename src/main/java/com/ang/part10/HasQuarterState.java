package com.ang.part10;


import java.util.Random;

/**
 * @author: 于昂
 * @date: 2022/11/10
 **/
public class HasQuarterState implements State {
    GumballMachine gumballMachine;

    Random r = new Random();

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("无法投入硬币, 因为已经投过");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("退币成功");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void tumCrank() {
        System.out.println("转动手柄成功");
        int i = r.nextInt(2);
        if (i == 0 && gumballMachine.getCount() > 1) {
            gumballMachine.setState(gumballMachine.getWinneStatus());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("没有糖果分发");
    }
}
