package com.ang.part9;

import java.util.Iterator;

/**
 * @author: 于昂
 * @date: 2022/11/9
 **/
public class MenuItem extends MenuComponent {
    String name;
    String desc;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String desc, boolean vegetarian, double price) {
        this.name = name;
        this.desc = desc;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.printf("%n %s", getName());
        if (isVegetarian()) {
            System.out.print("(v)");
        }
        System.out.printf(", %.2f", getPrice());
        System.out.printf("%n    --%s%n", getDesc());
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        return new NullIterator();
    }
}
