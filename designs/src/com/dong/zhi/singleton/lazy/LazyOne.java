package com.dong.zhi.singleton.lazy;

/**
 * 懒汉式：用到的时候才进行实例化
 * 缺点：存在线程安全问题
 */
public class LazyOne {
    /**
     * static 静态块，公共内存区域
     */
    private static LazyOne lazyOne = null;

    private LazyOne(){}

    public static LazyOne getInstance(){
        //并发的情况下，会同时有多个线程判断if的结果为true，new了多个对象
        if(lazyOne == null){
            lazyOne = new LazyOne();
        }
        return lazyOne;
    }
}
