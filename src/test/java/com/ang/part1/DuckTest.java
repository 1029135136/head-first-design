package com.ang.part1;

import com.ang.part1.duck.impl.FlyWithWings;
import com.ang.part1.duck.impl.ModelDuck;
import org.junit.Test;


public class DuckTest {

    @Test
    public void test1() {
        ModelDuck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyWithWings());

        modelDuck.performFly();
    }

}
