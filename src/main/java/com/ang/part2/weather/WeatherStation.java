package com.ang.part2.weather;

import com.ang.part2.weather.impl.CurrentConditionsDisplay;
import com.ang.part2.weather.impl.WeatherData;

/**
 * @author: 于昂
 * @date: 2022/8/3
 **/
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);


        weatherData.setMeasurement(80, 60, 100);
    }
}
