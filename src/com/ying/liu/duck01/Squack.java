package com.ying.liu.duck01;

public class Squack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }
}
