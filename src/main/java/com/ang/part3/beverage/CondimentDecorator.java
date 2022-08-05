package com.ang.part3.beverage;

/**
 * @author: 于昂
 * @date: 2022/8/3
 **/
public abstract class CondimentDecorator extends Beverage {
    /**
     * 返回饮料+调料的描述
     */
    @Override
    public abstract String getDesc();
}
