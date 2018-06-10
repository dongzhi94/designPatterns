package com.dong.zhi.duck01;

public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();//将叫的职责委托给quack对象
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("I'm a real Mallard duck.");
    }
}
