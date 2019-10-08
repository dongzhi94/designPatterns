package com.dong.zhi.singleton.test;

import com.dong.zhi.singleton.lazy.LazyThree;

import java.lang.reflect.Constructor;

public class LazyThreeTest {

    public static void main(String[] args) {
        //使用反射创建实例.进行单例破坏
        Class<?> clazz = LazyThree.class;

        try {
            //通过反射拿到私有的构造方法
            Constructor c = clazz.getDeclaredConstructor(null);
            //强制访问
            c.setAccessible(true);
            //暴力初始化
            Object o1 = c.newInstance();
            //调用了两次构造方法。此案例就是通过反射直接调用构造方法两次，获得实例，而不是通过内部类获取，所以获取到的是多个对象
            Object o2 = c.newInstance();
            //false
            System.out.println(o1 == o2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
