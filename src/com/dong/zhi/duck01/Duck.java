package com.dong.zhi.duck01;

public class Duck {

    public FlyBehavior flyBehavior;

    public QuackBehavior quackBehavior;

    public void performQuack(){
        //鸭子对象不亲自处理呱呱叫的行为，而是委托给quackBehavior引用的对象
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void swim(){
        System.out.println("游泳");
    }

    public void display(){
        System.out.println("无外观");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
