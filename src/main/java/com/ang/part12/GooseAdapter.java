package com.ang.part12;

/**
 * @author: 于昂
 * @date: 2022/11/21
 **/
public class GooseAdapter implements Quackable{
    private Goose goose;
    private Observable observable;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        this.observable = new Observable(this);

    }

    @Override
    public void quack() {
        goose.honk();
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
