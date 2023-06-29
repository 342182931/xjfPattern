package com.xu.pattern.factoryPattern.SimpleFactory;

/**
 * @Author xujianfeng
 * @DATE 2023/6/29 11:16
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
