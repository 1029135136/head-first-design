package com.ang.compound;

import com.ang.compound.combine.Flock;
import com.ang.compound.decorate.DuckQuackCountDecorate;
import com.ang.compound.duck.DuckCall;
import com.ang.compound.factory.DecorateQuackCountDuckFactory;
import com.ang.compound.observer.Observable;
import com.ang.compound.observer.QuackScholar;
import org.junit.Test;

public class QuackableTest {
    @Test
    public void test1() {
        DecorateQuackCountDuckFactory factory = new DecorateQuackCountDuckFactory();
        Quackable duckCall = factory.createDuckCall();
        Quackable mallardDuck = factory.createMallardDuck();
        Quackable redHeadDuck = factory.createRedHeadDuck();
        Quackable rubberDuck = factory.createRubberDuck();

        Flock flock = new Flock();

        flock.add(duckCall);
        flock.add(mallardDuck);
        flock.add(redHeadDuck);
        flock.add(rubberDuck);

        QuackScholar observer = new QuackScholar();
        flock.registerObserver(observer);

        flock.quack();

        DuckQuackCountDecorate.printQuackCount();

    }
}
