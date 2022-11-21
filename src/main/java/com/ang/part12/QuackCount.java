package com.ang.part12;

/**
 * @author: 于昂
 * @date: 2022/11/21
 **/
public class QuackCount implements Quackable {
    private Quackable quackable;
    private Observable observable;
    static int count;

    public QuackCount(Quackable quackable) {
        this.quackable = quackable;
        this.observable = new Observable(this);

    }

    @Override
    public void quack() {
        quackable.quack();
        count++;
    }

    public static int getQuacks() {
        return count;
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
