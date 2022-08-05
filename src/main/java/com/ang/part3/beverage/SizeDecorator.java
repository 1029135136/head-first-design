package com.ang.part3.beverage;

/**
 * @author: 于昂
 * @date: 2022/8/3
 **/
public abstract class SizeDecorator extends Beverage {
    /**
     * 返回饮料+杯子的描述
     */
    @Override
    public abstract String getDesc();
}
