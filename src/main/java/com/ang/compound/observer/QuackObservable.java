package com.ang.compound.observer;

import com.ang.compound.Quackable;

/**
 * 可观察接口
 *
 * @author: 于昂
 * @date: 2022/8/9
 **/
public interface QuackObservable {
    /**
     * 注册观察者对象
     *
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 通知观察者
     */
    void notifyObservers();
}
