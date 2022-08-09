package com.ang.compound.combine;

import com.ang.compound.Quackable;
import com.ang.compound.duck.DuckCall;
import com.ang.compound.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 于昂
 * @date: 2022/8/9
 **/
public class Flock implements Quackable {
    private final List<Quackable> quackableList;

    public Flock() {
        this.quackableList = new ArrayList<>();
    }

    public void add(Quackable quackable) {
        quackableList.add(quackable);
    }

    @Override
    public void quack() {
        quackableList.forEach(Quackable::quack);
    }

    @Override
    public void registerObserver(Observer observer) {
        quackableList.forEach(i -> i.registerObserver(observer));
    }

    @Override
    public void notifyObservers() {

    }
}
