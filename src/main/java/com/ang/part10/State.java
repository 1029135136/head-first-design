package com.ang.part10;

/**
 * @author: 于昂
 * @date: 2022/11/10
 **/
public interface State {
    void insertQuarter();

    void ejectQuarter();

    void tumCrank();

    void dispense();
}
