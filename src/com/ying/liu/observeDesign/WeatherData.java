package com.ying.liu.observeDesign;

import java.util.ArrayList;

/**
 * 气象数据
 */
public class WeatherData implements Subject {

    private float temperature;
    private float humidity;
    private float pressure;

    private ArrayList observers;//观察者们

    public WeatherData(){
        observers = new ArrayList();//构造方法中建立观察者
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if(i >= 0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for(int i = 0 ; i < observers.size() ; i++){
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }

    /**
     * 当从气象站得到更新的观测值时，通知观察者
     */
    public void measurementsChanged(){
        notifyObservers();;
    }

    /**
     * 气象站更新时。会调用此方法
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
