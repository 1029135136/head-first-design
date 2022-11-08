package com.ang.part3;

/**
 * @author: 于昂
 * @date: 2022/11/7
 **/
public class BeverageTest {
    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        coffee = new Milk(coffee);
        coffee = new Sugar(coffee);
        System.out.printf("cost: %.2f %s%n", coffee.cost(), coffee.getDesc());

        Beverage tea = new Tea();
        tea = new Sugar(tea);
        System.out.printf("cost: %.2f %s%n", tea.cost(), tea.getDesc());
    }
}
