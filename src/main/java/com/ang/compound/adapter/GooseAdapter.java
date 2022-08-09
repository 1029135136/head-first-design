package com.ang.compound.adapter;

import com.ang.compound.Quackable;
import com.ang.compound.goose.Goose;
import com.ang.compound.observer.Observer;

/**
 * @author: 于昂
 * @date: 2022/8/8
 **/
public class GooseAdapter implements Quackable {


    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
