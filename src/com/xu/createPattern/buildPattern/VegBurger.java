package com.xu.createPattern.buildPattern;

/**
 * @Author xujianfeng
 * @DATE 2023/6/28 10:53
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "素食汉堡";
    }
}
