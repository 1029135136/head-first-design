package com.ang.part1.duck.impl;

import com.ang.part1.duck.Duck;

/**
 * @author: 于昂
 * @date: 2022/8/3
 **/
public class ModelDuck extends Duck {
    public ModelDuck() {
        setFlyBehavior(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("im a model duck");
    }
}
