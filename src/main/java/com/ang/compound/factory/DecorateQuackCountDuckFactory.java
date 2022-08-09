package com.ang.compound.factory;

import com.ang.compound.decorate.DuckQuackCountDecorate;
import com.ang.compound.Quackable;
import com.ang.compound.duck.DuckCall;
import com.ang.compound.duck.MallardDuck;
import com.ang.compound.duck.RedHeadDuck;
import com.ang.compound.duck.RubberDuck;

/**
 * @author: 于昂
 * @date: 2022/8/9
 **/
public class DecorateQuackCountDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createDuckCall() {
        return new DuckQuackCountDecorate(new DuckCall());
    }

    @Override
    public Quackable createMallardDuck() {
        return new DuckQuackCountDecorate(new MallardDuck());
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new DuckQuackCountDecorate(new RedHeadDuck());

    }

    @Override
    public Quackable createRubberDuck() {
        return new DuckQuackCountDecorate(new RubberDuck());

    }
}
