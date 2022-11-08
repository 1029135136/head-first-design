package com.ang.part3;

/**
 * @author: 于昂
 * @date: 2022/11/7
 **/
public class Caffeine extends Condiment {
    Beverage beverage;

    public Caffeine(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + ", 咖啡因";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.2;
    }
}
