package com.ang.part3.beverage;

/**
 * 浓缩咖啡
 *
 * @author: 于昂
 * @date: 2022/8/3
 **/
public class Espresso extends Beverage {

    public Espresso() {
        desc = "Espresso";
    }


    @Override
    public double cost() {
        return 1.0;
    }
}
