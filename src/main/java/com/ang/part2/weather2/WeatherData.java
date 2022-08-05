package com.ang.part2.weather2;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * @author: 于昂
 * @date: 2022/8/3
 **/
@Data
public class WeatherData extends Observable {
    private float temp;
    private float humidity;
    private float pressure;
    public WeatherData() {
    }

    public void measurementChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurement(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementChanged();
    }
}
