package com.dong.zhi.observeDesign.useJdk;

public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
//        conditionsDisplay.update(weatherData,null);
//        forecastDisplay.update(weatherData,null);
        weatherData.setMeasurements(80,69,23.9f);
        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,70,29.2f);
        weatherData.setMeasurements(78,90,29.2f);
    }
}
