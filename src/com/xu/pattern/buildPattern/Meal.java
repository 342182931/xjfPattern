package com.xu.pattern.buildPattern;
import java.util.ArrayList;
import java.util.List;
/**
 * @Author xujianfeng
 * @DATE 2023/6/28 10:55
 */


public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item : items) {
            System.out.print("项目 : "+item.name());
            System.out.print(", 包 : "+item.packing().pack());
            System.out.println(", 价格 : "+item.price());
        }
    }
}
