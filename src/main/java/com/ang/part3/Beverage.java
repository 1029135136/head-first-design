package com.ang.part3;

/**
 * @author: 于昂
 * @date: 2022/11/7
 **/
public abstract class Beverage {
    public String desc = "未知饮品";

    public String getDesc() {
        return desc;
    }

    abstract public double cost();
}
