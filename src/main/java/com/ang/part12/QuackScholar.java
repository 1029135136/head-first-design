package com.ang.part12;

/**
 * @author: 于昂
 * @date: 2022/11/21
 **/
public class QuackScholar implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.printf("QuackScholar: %s just quack", duck);
    }
}
