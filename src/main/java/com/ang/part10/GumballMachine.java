package com.ang.part10;

import lombok.Data;

/**
 * @author: 于昂
 * @date: 2022/11/10
 **/
@Data
public class GumballMachine {
    private final State soldOutState;
    private final State noQuarterState;
    private final State hasQuarterState;
    private final State soldState;
    private final State winneStatus;

    private State state;
    int count = 0;

    public GumballMachine(int count) {
        this.soldOutState = new SoldOutState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);
        this.winneStatus = new WinneStatus(this);
        this.count = count;

        this.state = this.soldOutState;
        if (count > 0) {
            this.state = this.noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void tumCrank() {
        state.tumCrank();
        state.dispense();
    }

    void releaseBall() {
        System.out.println("出糖成功");
        if (count != 0) {
            count--;
        } else {
            System.out.println("全部糖果已经出完");
        }
    }
}
