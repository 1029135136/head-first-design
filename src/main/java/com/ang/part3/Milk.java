package com.ang.part3;

/**
 * @author: 于昂
 * @date: 2022/11/7
 **/
public class Milk extends Condiment {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + ", 牛奶";
    }

    @Override
    public double cost() {


        return beverage.cost() + 0.5;
    }
}
