package com.dong.zhi.singleton.hungry;

/**
 * 饿汉式单例：在类加载的时候立即初始化，并且创建单例对象
 * 优点：线程绝对安全，不存在线程安全问题
 * 缺点：类加载的时候就实例化，占用空间，浪费内存。可能实例化后并没有人用
 */
public class Hungry {

    private Hungry(){

    }
    /**
     * static表示资源可共享，final表示变量不可更改
     */
    private static final Hungry hungry = new Hungry();

    public static Hungry getInstance(){
        return hungry;
    }
}
