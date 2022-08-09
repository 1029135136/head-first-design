package com.ang.compound.decorate;


import com.ang.compound.Quackable;
import com.ang.compound.observer.Observer;

/**
 * 鸭子叫声统计装饰器
 *
 * @author: 于昂
 * @date: 2022/8/9
 **/
public class DuckQuackCountDecorate implements Quackable {
    private static int count = 0;
    private final Quackable quackable;

    public DuckQuackCountDecorate(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        count++;
    }

    public static void printQuackCount() {
        System.out.println("quack num: " + count);
    }

    @Override
    public void registerObserver(Observer observer) {
        quackable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        quackable.notifyObservers();
    }
}
