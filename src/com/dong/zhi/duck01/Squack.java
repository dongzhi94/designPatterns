package com.dong.zhi.duck01;

public class Squack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }
}
