package com.ang.part1;

import com.ang.part1.duck.impl.FlyNoWay;
import com.ang.part1.duck.impl.MallardDuck;
import org.junit.Test;

public class MallardDuckTest {

    @Test
    public void test1() {
        MallardDuck mallard = new MallardDuck();
        mallard.setFlyBehavior(new FlyNoWay());

        mallard.performFly();

    }
}
