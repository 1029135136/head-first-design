package com.ang.compound;

import com.ang.compound.observer.QuackObservable;

/**
 * @author: 于昂
 * @date: 2022/8/8
 **/
public interface Quackable extends QuackObservable {
    /**
     * 叫声
     */
    void quack();
}
