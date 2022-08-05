package com.ang.part2.weather2;

import com.ang.part2.weather.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @author: 于昂
 * @date: 2022/8/3
 **/
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;
    private float pressure;

    public CurrentConditionsDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("Current conditions: %.2fF degrees and %.2f humidity", temp, humidity);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temp = weatherData.getTemp();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }
}
