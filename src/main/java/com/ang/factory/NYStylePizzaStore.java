package com.ang.factory;

/**
 * @author: 于昂
 * @date: 2022/8/4
 **/
public class NYStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;

        if ("cheese".equals(type)) {
            pizza = new CheesePizza();
        } else if ("clam".equals(type)) {
            pizza = new ClamPizza();
        } else {
            pizza = new DefaultPizza();
        }

        return pizza;
    }
}
