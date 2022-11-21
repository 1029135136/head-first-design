package com.ang.part12;



/**
 * @author: 于昂
 * @date: 2022/11/21
 **/
public interface QuackObservable {
    void registerObserver(Observer observer);

    void notifyObservers();
}
