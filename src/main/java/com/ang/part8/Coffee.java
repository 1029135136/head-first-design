package com.ang.part8;

/**
 * @author: 于昂
 * @date: 2022/11/9
 **/
public class Coffee extends CaffeineBeverage {


    @Override
    void brew() {
        System.out.println("煮咖啡粉");

    }

    @Override
    void addCondiments() {
        System.out.println("添加牛奶和糖");

    }
}
