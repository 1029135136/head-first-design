package com.ang.part3;

import com.ang.part3.beverage.*;
import org.junit.Test;

public class BeverageTest {

    @Test
    public void test1() {
        Beverage darkRoast = new DarkRoast();
        System.out.printf("%s cost is %.2f%n", darkRoast.getDesc(), darkRoast.cost());

        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.printf("%s cost is %.2f%n", darkRoast.getDesc(), darkRoast.cost());
    }

}
