package com.ang.part4;

/**
 * @author: 于昂
 * @date: 2022/11/8
 **/
public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String style) {
        Pizza pizza;
        IngredientFactory factory = new NYIngredientFactory();
        if (style.equals("cheese")) {
            pizza = new CheesePizza(factory,"纽约芝士披萨");
        } else {
            pizza = new ClamPizza(factory,"海鲜披萨");
        }
        return pizza;
    }
}
