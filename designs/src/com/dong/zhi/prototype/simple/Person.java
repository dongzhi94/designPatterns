package com.dong.zhi.prototype.simple;

import java.util.List;

public class Person implements Cloneable{

    private String name;

    private int age;

    private List<String> list;

    private Body body;

    public Person(String name, int age,List<String> list) {
        this.name = name;
        this.age = age;
        this.list = list;
        body = new Body();
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
