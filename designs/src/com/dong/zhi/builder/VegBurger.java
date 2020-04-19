package com.dong.zhi.builder;

/**
 * @author ：dongzhi
 * @date ：Created in 2020/4/19 8:35
 * @description：素汉堡类
 * @modified By：
 * @version: 1.0$
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
