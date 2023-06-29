package com.xu.pattern.buildPattern;

/**
 * @Author xujianfeng
 * @DATE 2023/6/28 10:53
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
