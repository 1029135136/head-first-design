package com.ang.part3.beverage;

import lombok.Data;

/**
 * @author: 于昂
 * @date: 2022/8/3
 **/
@Data
public abstract class Beverage {
    String desc = "unknown beverage";

    private int size = SMALL;

    public static final int BIG = 1;
    public static final int MIDDLE = 2;
    public static final int SMALL = 3;

    /**
     * 价格
     */
    public abstract double cost();
}
