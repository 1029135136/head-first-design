package com.ang.part12;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 于昂
 * @date: 2022/11/21
 **/
public class Flock implements Quackable{
    private List<Quackable> quackables = new ArrayList<>();

    private Observable observable;

    public Flock() {
        this.observable = new Observable(this);
    }

    public void add(Quackable quackable) {
        quackables.add(quackable);
    }

    @Override
    public void quack() {
        quackables.forEach(Quackable::quack);
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
