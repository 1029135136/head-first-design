package com.ang.part3.beverage;

/**
 * @author: 于昂
 * @date: 2022/8/3
 **/
public class HouseBlend extends Beverage {
    public HouseBlend() {
        desc = "HouseBlend";
    }

    @Override
    public double cost() {
        return 2.0;
    }
}
