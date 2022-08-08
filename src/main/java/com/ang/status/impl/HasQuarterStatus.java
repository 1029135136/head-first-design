package com.ang.status.impl;

import com.ang.status.GumballMachine;
import com.ang.status.Status;

import java.util.Random;

/**
 * @author: 于昂
 * @date: 2022/8/8
 **/
public class HasQuarterStatus implements Status {
    GumballMachine gumballMachine;

    Random random = new Random(System.currentTimeMillis());

    public HasQuarterStatus(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("已经投过硬币,无法再次投入!");
    }

    @Override
    public void ejectQuarter() {
        gumballMachine.setStatus(gumballMachine.getNoQuarterStatus());
        System.out.println("退回25美分成功");
    }

    @Override
    public boolean turnCrank() {
        System.out.println("转动曲柄成功");
        int winner = random.nextInt(3);
        if (winner == 0 && gumballMachine.getCount() > 1) {
            gumballMachine.setStatus(gumballMachine.getWinnerStatus());
        } else {
            gumballMachine.setStatus(gumballMachine.getSoldStatus());
        }
        return true;
    }

    @Override
    public void dispense() {
        System.out.println("没有转动曲柄,无法发放糖果!");
    }

    @Override
    public String toString() {
        return "HasQuarter";
    }
}
