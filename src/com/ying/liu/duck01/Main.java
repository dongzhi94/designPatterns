package com.ying.liu.duck01;


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Duck duck = new MallardDuck();
        duck.display();//子类重写了父类的方法
        duck.performQuack();
        duck.swim();
        duck.setFlyBehavior(new FlyRockedPowered());//动态的改变了鸭子的行为
        duck.performFly();
    }
}
