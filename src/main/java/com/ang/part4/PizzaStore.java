package com.ang.part4;

/**
 * @author: 于昂
 * @date: 2022/11/8
 **/
public abstract class PizzaStore {
    public Pizza orderPizza(String style) {
        Pizza pizza = createPizza(style);
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String style);
}
