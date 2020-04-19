package com.dong.zhi.builder;

/**
 * @author ：dongzhi
 * @date ：Created in 2020/4/19 8:25
 * @description：冷饮抽象类
 * @modified By：
 * @version: 1.0$
 */
public abstract class ColdDrink implements Item{
    /**
     * 冷饮使用瓶装
     * @return
     */
    @Override
    public Packing packing() {
        return new Bottle();
    }

    /**
     * 不同冷饮价格不同，交给具体冷饮实现类去重写
     * @return
     */
    @Override
    public abstract float price();
}
