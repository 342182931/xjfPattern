package com.xu.createPattern.factoryPattern.SimpleFactory;

/**
 * @Author xujianfeng
 * @DATE 2023/6/29 11:17
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
