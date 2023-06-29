package com.xu.pattern.prototypePattern;

/**
 * @Author xujianfeng
 * @DATE 2023/6/29 11:36
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
