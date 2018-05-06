package com.dong.zhi.observeDesign.useJdk;

import com.dong.zhi.observeDesign.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer,DisplayElement {

    private float currentPressure = 29.32f;
    private float lastPressure;

    public ForecastDisplay(Observable observable){//表示当前布告板要注册哪个可观察者
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast currentPressure:"+ currentPressure + " lastPressure "+ lastPressure);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData)o;
            this.lastPressure = currentPressure;
            this.currentPressure = weatherData.getPressure();
            display();
        }
    }
}
