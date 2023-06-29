package com.xu.pattern.buildPattern;

/**
 * @Author xujianfeng
 * @DATE 2023/6/28 10:54
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
