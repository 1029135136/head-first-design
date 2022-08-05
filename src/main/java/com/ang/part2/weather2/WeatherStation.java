package com.ang.part2.weather2;

/**
 * @author: 于昂
 * @date: 2022/8/3
 **/
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurement(80, 50, 100);
    }
}
