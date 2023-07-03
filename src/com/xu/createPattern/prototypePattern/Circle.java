package com.xu.createPattern.prototypePattern;

/**
 * @Author xujianfeng
 * @DATE 2023/6/29 11:37
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
