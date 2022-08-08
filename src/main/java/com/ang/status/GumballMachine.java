package com.ang.status;

import com.ang.status.impl.*;
import lombok.Data;

/**
 * 糖果机器
 *
 * @author: 于昂
 * @date: 2022/8/8
 **/
@Data
public class GumballMachine {
    private Status hasQuarterStatus;
    private Status noQuarterStatus;
    private Status soldOutStatus;
    private Status soldStatus;
    private Status winnerStatus;

    private Status status = soldOutStatus;

    private int count = 0;
    private String location = "";

    public GumballMachine(int count) {
        this.count = count;
        hasQuarterStatus = new HasQuarterStatus(this);
        noQuarterStatus = new NoQuarterStatus(this);
        soldOutStatus = new SoldOutStatus(this);
        soldStatus = new SoldStatus(this);
        winnerStatus = new WinnerStatus(this);
        if (count > 0) {
            status = noQuarterStatus;
        }
    }

    public GumballMachine(int count, String location) {
        this(count);
        this.location = location;
    }

    public void insertQuarter() throws NoSuchMethodException {
        status.insertQuarter();
    }

    public void ejectQuarter() throws NoSuchMethodException {
        status.ejectQuarter();
    }

    public void turnCrank() throws NoSuchMethodException {
        boolean result = status.turnCrank();
        if(result) status.dispense();
        System.out.println("===========================================================================");
    }

    public void releaseBall() {
        System.out.println("机器出糖果");
        if (count!=0) {
            count--;
        }
    }

    public void load(int num) {
        status.load(num);
    }
}
