package com.ang.part1.duck;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 鸭子超类
 *
 * @author: 于昂
 * @date: 2022/8/3
 **/
@Data
@NoArgsConstructor
public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    /**
     * 展示
     */
    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("all duck can swim");
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}
