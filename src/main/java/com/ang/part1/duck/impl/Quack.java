package com.ang.part1.duck.impl;

import com.ang.part1.duck.QuackBehavior;

/**
 * @author: 于昂
 * @date: 2022/8/3
 **/
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("i can quack");
    }
}
