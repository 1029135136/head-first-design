package com.ang.compound.duck;

import com.ang.compound.Quackable;
import com.ang.compound.observer.Observable;
import com.ang.compound.observer.Observer;

/**
 * @author: 于昂
 * @date: 2022/8/8
 **/
public class RedHeadDuck implements Quackable {
    private final Observable observable;

    public RedHeadDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("quack");
        notifyObservers();

    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
