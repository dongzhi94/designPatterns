package com.dong.zhi.singleton.lazy;

/**
 * 懒汉式：用到的时候才进行实例化.在one的基础上加上同步关键字synchronized，可解决线程安全问题，
 * 但是，严重影响性能
 */
public class LazyTwo {
    /**
     * static 静态块，公共内存区域
     */
    private static LazyTwo lazyTwo = null;

    private LazyTwo(){}

    public static synchronized LazyTwo getInstance(){
        //并发的情况下，会同时有多个线程判断if的结果为true，new了多个对象
        if(lazyTwo == null){
            lazyTwo = new LazyTwo();
        }
        return lazyTwo;
    }
}
