package com.ang.part4;

/**
 * @author: 于昂
 * @date: 2022/11/8
 **/
public class PizzaTest {
    public static void main(String[] args) {
        NYPizzaStore pizzaStore = new NYPizzaStore();
        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println(pizza);
    }
}
