package com.ang.part3.beverage;

/**
 * @author: 于昂
 * @date: 2022/8/3
 **/
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.3;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + " , " + "Whip";
    }
}
