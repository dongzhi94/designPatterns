package com.dong.zhi.prototype.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleCloneTest {

    public static void main(String[] args) {
        Person person1 = new Person("aaa",13,new ArrayList<String>(Arrays.asList("o1", "o2")));
        Person person2 = null;
        try {
            person2 = (Person) person1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        //pserson1:com.dong.zhi.prototype.simple.Person@1540e19d
        //pserson2:com.dong.zhi.prototype.simple.Person@677327b6
        //true  代表拷贝的是String对象的引用。浅拷贝
        //true
        //true
        System.out.println("person1:"+person1);
        System.out.println("person2:"+person2);
        System.out.println(person1.getName() == person2.getName());
        System.out.println(person1.getList() == person2.getList());
        System.out.println(person1.getBody() == person2.getBody());

        person2.getBody().setHead("333");

        //true 表示person2克隆的是person1中body的引用，所以当person2对body对象进行更改时，person1的body对象也被更改了
        //333
        //333
        System.out.println(person1.getBody() == person2.getBody());
        System.out.println(person1.getBody().getHead());
        System.out.println(person2.getBody().getHead());

    }
}
