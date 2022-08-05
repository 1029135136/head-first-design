package com.ang.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 于昂
 * @date: 2022/8/4
 **/
public class Pizza {
    String name;

    String dough;

    String sauce;

    List<String> toppings = new ArrayList<String>();

    void prepare() {
        System.out.println("preparing " + name);
        System.out.println("tossing dough");
        System.out.println("add sauce");
        System.out.println("add toppings: ");
        for (String topping : toppings) {
            System.out.println("    " + topping);
        }
    }

    void bake() {
        System.out.println("bake");
    }

    void cut() {
        System.out.println("cut");
    }

    void box() {
        System.out.println("box");
    }

    public String getName() {
        return name;
    }
}
