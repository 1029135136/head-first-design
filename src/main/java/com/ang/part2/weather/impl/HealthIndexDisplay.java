package com.ang.part2.weather.impl;

import com.ang.part2.weather.DisplayElement;
import com.ang.part2.weather.Observer;
import com.ang.part2.weather.Subject;

/**
 * @author: 于昂
 * @date: 2022/8/3
 **/
public class HealthIndexDisplay implements Observer, DisplayElement {


    private Subject weatherData;


    /**
     * 基础气象数据
     */
    private float temp;
    private float humidity;
    private float pressure;

    public HealthIndexDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        this.display();
    }

    @Override
    public void display() {
        System.out.printf("HealthIndexDisplay: %.2fF degrees and %.2f humidity%n", this.temp, this.humidity);
    }
}
