package com.dong.zhi.observeDesign;

/**
 * 气象站测试
 */
public class WeatherStation {

    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();//初始化了观察者list
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);//观察者注册了主题接口

        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,70,29.2f);
        weatherData.setMeasurements(78,90,29.2f);
    }
}
