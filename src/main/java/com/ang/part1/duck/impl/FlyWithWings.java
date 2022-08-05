package com.ang.part1.duck.impl;

import com.ang.part1.duck.FlyBehavior;

/**
 * @author: 于昂
 * @date: 2022/8/3
 **/
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("i can fly");
    }
}
