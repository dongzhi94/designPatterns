package com.dong.zhi.builder;

/**
 * @author ：dongzhi
 * @date ：Created in 2020/4/19 8:19
 * @description：食物条目
 * @modified By：
 * @version: 1.0$
 */
public interface Item {
    String name();

    Packing packing();

    float price();
}
