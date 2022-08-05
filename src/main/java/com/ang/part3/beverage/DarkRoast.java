package com.ang.part3.beverage;

/**
 * @author: 于昂
 * @date: 2022/8/3
 **/
public class DarkRoast extends Beverage {

    public DarkRoast() {
        desc = "DarkRoast";
    }


    @Override
    public double cost() {
        return 1;
    }
}
