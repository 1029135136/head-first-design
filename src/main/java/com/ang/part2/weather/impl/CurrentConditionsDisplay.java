package com.ang.part2.weather.impl;

import com.ang.part2.weather.DisplayElement;
import com.ang.part2.weather.Observer;
import com.ang.part2.weather.Subject;

/**
 * @author: 于昂
 * @date: 2022/8/3
 **/
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;
    private float pressure;

    private Subject weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.printf("Current conditions: %.2fF degrees and %.2f humidity", temp, humidity);
    }
}
