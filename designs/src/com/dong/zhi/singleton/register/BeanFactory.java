package com.dong.zhi.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册式单例：第二种：容器缓存
 */
public class BeanFactory {

    private BeanFactory(){}
    /**
     * 为了线程安全，但不能完全保证
     */
    private static Map<String,Object> ioc = new ConcurrentHashMap<>();

    public static Object getBean(String className){
        //不加synchronized的情况下，非线程安全
        synchronized (ioc){
            if(ioc.containsKey(className)){
                return ioc.get(className);
            }else{
                Object obj = null;
                try {
                    obj = Class.forName(className).newInstance();
                    ioc.put(className,obj);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }

                return obj;
            }
        }

    }
}
