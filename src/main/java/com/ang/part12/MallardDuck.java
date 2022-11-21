package com.ang.part12;


/**
 * @author: 于昂
 * @date: 2022/11/21
 **/
public class MallardDuck implements Quackable {
    private QuackObservable observable;

    public MallardDuck() {
        this.observable = new Observable(this);

    }

    @Override
    public void quack() {
        System.out.println("Quack");
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
