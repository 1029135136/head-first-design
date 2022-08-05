package com.ang.factory;

/**
 * @author: 于昂
 * @date: 2022/8/4
 **/
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else {
            pizza = new DefaultPizza();
        }

        return pizza;
    }
}
