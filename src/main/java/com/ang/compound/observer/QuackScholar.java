package com.ang.compound.observer;

/**
 * @author: 于昂
 * @date: 2022/8/9
 **/
public class QuackScholar implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("QuackScholar " + duck + " just quack");
    }
}
