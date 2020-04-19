package com.dong.zhi.builder;

/**
 * @author ：dongzhi
 * @date ：Created in 2020/4/19 8:25
 * @description：汉堡抽象类
 * @modified By：
 * @version: 1.0$
 */
public abstract class Burger implements Item{
    /**
     * 汉堡都是用纸盒打包，所以提供默认功能
     * @return
     */
    @Override
    public Packing packing() {
        return new Wrapper();
    }

}
