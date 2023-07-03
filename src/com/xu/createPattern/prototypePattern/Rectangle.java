package com.xu.createPattern.prototypePattern;

/**
 * @Author xujianfeng
 * @DATE 2023/6/29 11:36
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
