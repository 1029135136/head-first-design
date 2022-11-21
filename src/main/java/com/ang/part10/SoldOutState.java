package com.ang.part10;

/**
 * @author: 于昂
 * @date: 2022/11/10
 **/
public class SoldOutState implements State{
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("无法执行操作, 因为已经售完");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("无法执行操作, 因为已经售完");
    }

    @Override
    public void tumCrank() {
        System.out.println("无法执行操作, 因为已经售完");
    }

    @Override
    public void dispense() {
        System.out.println("无法执行操作, 因为已经售完");
    }
}
