package com.dong.zhi.singleton.seriable;

import java.io.Serializable;

/**
 * 序列化与反序列化破坏单例
 */
public class Seriable implements Serializable {

    private Seriable(){}

    /**
     * 序列化就是说，把内存中的状态通过转换成字节码的形式，从而转换成一个IO流，写入到其他地方（可以是磁盘、网络IO），内存中的状态被永久保存下来了
     * 反序列化就是，将已经持久化的字节码内容，转换为IO流，通过IO流的读取，进而将读取的内容转换为Java对象，在转换过程中会重新创建对象new，破坏单例
     */
    private final static Seriable INSTANCE = new Seriable();

    public static Seriable getInstance() {
        return INSTANCE;
    }

    /**
     * 在jdk中ObjectInputStream的类中有readUnshared（）方法。简单描述一下，那就是如果被反序列化的对象的类存在readResolve这个方法，他会调用这个方法来返回一个“array”（我也不明白），然后浅拷贝一份，作为返回值，并且无视掉反序列化的值，即使那个字节码已经被解析。
     * 结果就是，需要序列化和反序列化的类中加入private Object readResolve（）方法后，反序列化后的对象与序列化的对象是一致的，即保证了单例。
     * @return
     */
    private Object readResolve(){
        return INSTANCE;
    }

}
