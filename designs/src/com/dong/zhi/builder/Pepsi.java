package com.dong.zhi.builder;

/**
 * @author ：dongzhi
 * @date ：Created in 2020/4/19 8:37
 * @description：冷饮-百事可乐类
 * @modified By：
 * @version: 1.0$
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
