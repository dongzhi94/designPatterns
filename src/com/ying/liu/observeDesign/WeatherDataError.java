package com.ying.liu.observeDesign;

public class WeatherDataError {
    //错误示范
    float temp = getTemperature();
    float humidity = getHumidity();
    float pressure = getPressure();

    float getTemperature(){
        return 0;
    }
    float getHumidity(){
        return 0;
    }
    float getPressure(){
        return 0;
    }
}
