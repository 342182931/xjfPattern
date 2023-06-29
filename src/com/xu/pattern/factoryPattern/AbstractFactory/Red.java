package com.xu.pattern.factoryPattern.AbstractFactory;

/**
 * @Author xujianfeng
 * @DATE 2023/6/29 11:20
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
