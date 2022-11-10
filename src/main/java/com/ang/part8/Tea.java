package com.ang.part8;

/**
 * @author: 于昂
 * @date: 2022/11/9
 **/
public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("放茶包");
    }

    @Override
    void addCondiments() {
        System.out.println("放柠檬");
    }

}
