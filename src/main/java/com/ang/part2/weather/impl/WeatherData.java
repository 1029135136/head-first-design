package com.ang.part2.weather.impl;

import com.ang.part2.weather.Observer;
import com.ang.part2.weather.Subject;
import sun.text.CollatorUtilities;

import java.util.*;

/**
 * @author: 于昂
 * @date: 2022/8/3
 **/
public class WeatherData implements Subject {
    private final List<Observer> observers = new ArrayList<>();

    private float temp;
    private float humidity;
    private float pressure;

    @Override

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observers.size() > 0) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        observers.forEach(i -> i.update(temp, humidity, pressure));
    }

    public void measurementChanged() {
        notifyObserver();
    }

    public void setMeasurement(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementChanged();
    }
}
