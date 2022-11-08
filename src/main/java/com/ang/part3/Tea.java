package com.ang.part3;

/**
 * @author: 于昂
 * @date: 2022/11/7
 **/
public class Tea extends Beverage {
    public Tea() {
        desc = "咖啡";
    }

    @Override
    public double cost() {
        return 1.0;
    }
}
