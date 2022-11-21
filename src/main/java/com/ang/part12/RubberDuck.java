package com.ang.part12;

/**
 * @author: 于昂
 * @date: 2022/11/21
 **/
public class RubberDuck implements Quackable {
    private Observable observable;

    public RubberDuck() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Squeak");
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
