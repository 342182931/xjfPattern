package com.xu.pattern.factoryPattern.AbstractFactory;

/**
 * @Author xujianfeng
 * @DATE 2023/6/29 11:20
 */
public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
