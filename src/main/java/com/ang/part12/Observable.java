package com.ang.part12;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 于昂
 * @date: 2022/11/21
 **/
public class Observable implements QuackObservable{
    private final List<Observer> observables = new ArrayList<>();
    private final QuackObservable duck;

    public Observable(QuackObservable quackObservable) {
        this.duck = quackObservable;
    }

    @Override
    public void registerObserver(Observer observer) {
        observables.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer  observable : observables) {
            observable.update(duck);
        }
    }
}
