package com.ang.part12;

/**
 * @author: 于昂
 * @date: 2022/11/21
 **/
public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCount(new MallardDuck());
    }

    @Override
    public Quackable createReadHeadDuck() {
        return new QuackCount(new ReadHeadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCount(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCount(new RubberDuck());
    }
}
