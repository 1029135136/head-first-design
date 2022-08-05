package com.ang.part3.beverage;

/**
 * @author: 于昂
 * @date: 2022/8/3
 **/
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.2;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + " ," + "Mocha";
    }
}
