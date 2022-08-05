package com.ang.part2.weather;

/**
 * 观察者
 * @author: 于昂
 * @date: 2022/8/3
 **/
public interface Observer {
    /**
     * 更新数据了
     * @param temp 温度
     * @param humidity 湿度
     * @param pressure 气压
     */
    void update(float temp, float humidity, float pressure);
}
