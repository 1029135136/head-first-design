package com.ang.compound.factory;

import com.ang.compound.Quackable;

/**
 * @author: 于昂
 * @date: 2022/8/9
 **/
public abstract class AbstractDuckFactory {
    public abstract Quackable createDuckCall();
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedHeadDuck();
    public abstract Quackable createRubberDuck();
}
