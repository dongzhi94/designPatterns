package com.ying.liu.observeDesign;

/**
 * 主题接口
 */
public interface Subject {
    //注册观察者
    void registerObserver(Observer observer);
    //删除观察者
    void removeObserver(Observer observer);
    //通知观察者。当主题更改时，这个方法会被调用，以通知所有的观察者
    void notifyObservers();
}
