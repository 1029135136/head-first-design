package com.ang.part3.beverage;

/**
 * @author: 于昂
 * @date: 2022/8/3
 **/
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        switch (beverage.getSize()) {
            case Beverage.BIG:
                return cost + 0.2;
            case Beverage.MIDDLE:
                return cost + 0.15;
            default:
                return cost + 0.1;
        }
    }

    @Override
    public String getDesc() {
        return null;
    }
}
