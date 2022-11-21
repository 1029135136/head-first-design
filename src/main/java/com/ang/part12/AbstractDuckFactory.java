package com.ang.part12;

/**
 * @author: 于昂
 * @date: 2022/11/21
 **/
public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();

    public abstract Quackable createReadHeadDuck();

    public abstract Quackable createDuckCall();

    public abstract Quackable createRubberDuck();
}
