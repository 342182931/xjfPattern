package com.xu.pattern.buildPattern;

/**
 * @Author xujianfeng
 * @DATE 2023/6/28 10:54
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
