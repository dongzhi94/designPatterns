package com.dong.zhi.observeDesign.useJdk;

import java.util.Observable;

/**
 * 继承Java内置的“可观察者”
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;
    public WeatherData(){};//不需要为了记住观察者而建立数据结构了

    public void measurementsChanged(){
        setChanged();
        notifyObservers();//不传送数据对象，让观察者“拉”
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
