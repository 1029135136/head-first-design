package com.ang.part2.weather;

import java.util.ArrayList;
import java.util.List;

/**
 * 订阅者模式主题
 *
 * @author: 于昂
 * @date: 2022/8/3
 **/
public interface Subject {

    /**
     * 注册观察者
     *
     * @param observer 观察者
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     *
     * @param observer 观察者
     */
    void removeObserver(Observer observer);

    /**
     * 通知订阅者
     */
    void notifyObserver();
}
