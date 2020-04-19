package com.dong.zhi.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：dongzhi
 * @date ：Created in 2020/4/19 8:43
 * @description：套餐类
 * @modified By：
 * @version: 1.0$
 */
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for(Item item : items){
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for(Item item : items){
            System.out.print("Item:"+item.name());
            System.out.print(",Packing:"+item.packing().packing());
            System.out.println(",Price:"+item.price());
        }
    }
}
