package com.dong.zhi.singleton.lazy;

/**
 * 懒汉式单例：由于Lazytwo版本存在性能问题，所以考虑使用第三种方式，采用静态内部类
 * 特点：在外部类被调用时，内部类才会被加载。所以符合懒汉式单例。
 * 优点：巧妙的避免了线程安全问题，这种形式兼顾饿汉式的内存浪费，也兼顾synchronized的性能问题
 *
 */
public class LazyThree {

    //如果将static去掉，再通过反射更改该变量的值，是不是就可以破坏单例
    private static boolean initialized = false;

    //正常情况下，该构造方法只会被调用一次，测试被侵犯的情况
    private LazyThree(){
        synchronized (LazyThree.class){
            if(initialized == false){
                initialized = true;
            }else{
                throw new RuntimeException("单例被侵犯");
            }
        }
    }


    //每一个关键字都有作用
    //static是为了使单例的空间共享，final是保证这个方法不会被重写、重载
    public static final LazyThree getInstance(){
        //返回结果前，一定会先加载内部类
        return LazyHolder.lazyThree;
    }
    //默认不加载
    private static class LazyHolder{
        private static final LazyThree lazyThree = new LazyThree();
    }
}
