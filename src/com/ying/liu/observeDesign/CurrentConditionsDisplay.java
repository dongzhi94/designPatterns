package com.ying.liu.observeDesign;

/**
 * 目前状况布告板
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {

    private float tempratrue;
    private float humidity;
    private Subject weatherData;

    /**
     * 构造器需要主题对象作为参数，完成观察者的注册
     * @param weatherData
     */
    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData; //保存subject的引用，方便以后增加取消注册功能
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Current conditions:"+ tempratrue + "F degrees and "+ humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.tempratrue = temp;
        this.humidity = humidity;
        display();//更新即展示
        //问题：update是最适合调用display的地方吗？ 当使用到MVC的时候会有更好的方法来设计显示数据
    }
}
