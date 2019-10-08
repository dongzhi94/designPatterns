package com.dong.zhi.singleton.register;

/**
 * 注册式等级：第一种：枚举式单例
 * enum是由class实现的。enum是通过继承了Enum类实现的，enum结构不能够作为子类继承其他类，但是可以用来实现接口。此外，enum类也不能够被继承，在反编译中，我们会发现该类是final的。
 * 所以枚举可用来实现单例。
 * 其次，enum有且仅有private的构造器，防止外部的额外构造，这恰好和单例模式吻合，也为保证单例性做了一个铺垫。
 * 这里展开说下这个private构造器，如果我们不去手写构造器，则会有一个默认的空参构造器，我们也可以通过给枚举变量参量来实现类的初始化
 *
 * 枚举的反编译
 * 反编译后就会发现，使用枚举其实和使用静态类内部加载方法原理类似。枚举会被编译成如下形式：

     public final class T extends Enum{

     ...

     }
 * 其中，Enum是Java提供给编译器的一个用于继承的类。枚举量的实现其实是public static final T 类型的未初始化变量，之后，会在静态代码中对枚举量进行初始化。所以，如果用枚举去实现一个单例，这样的加载时间其实有点类似于饿汉模式，并没有起到lazy-loading的作用。

 对于序列化和反序列化，因为每一个枚举类型和枚举变量在JVM中都是唯一的，即Java在序列化和反序列化枚举时做了特殊的规定，枚举的writeObject、readObject、readObjectNoData、writeReplace和readResolve等方法是被编译器禁用的，因此也不存在实现序列化接口后调用readObject会破坏单例的问题。

 对于线程安全方面，类似于普通的饿汉模式，通过在第一次调用时的静态初始化创建的对象是线程安全的。

 因此，选择枚举作为Singleton的实现方式，相对于其他方式尤其是类似的饿汉模式主要有以下优点：

 1. 代码简单

 2. 自由序列化
 *
 *
 *
 */
public enum RegisterEnum {

    INSTANCE;

    public static RegisterEnum getInstance(){
        return INSTANCE;
    }
}
