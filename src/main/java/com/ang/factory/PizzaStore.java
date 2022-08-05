package com.ang.factory;

/**
 * @author: 于昂
 * @date: 2022/8/4
 **/
public abstract class PizzaStore {

    public abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
