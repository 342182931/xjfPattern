package com.xu.createPattern.factoryPattern.AbstractFactory;

/**
 * @Author xujianfeng
 * @DATE 2023/6/29 11:20
 */
public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
