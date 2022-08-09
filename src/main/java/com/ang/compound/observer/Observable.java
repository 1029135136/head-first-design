package com.ang.compound.observer;

import java.util.ArrayList;

/**
 * @author: 于昂
 * @date: 2022/8/9
 **/
public class Observable implements QuackObservable {
    ArrayList<Observer> observerList = new ArrayList<>();
    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }


    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(o -> o.update(duck));
    }
}
