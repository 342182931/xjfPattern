package com.xu.createPattern.factoryPattern.AbstractFactory;

import com.xu.createPattern.factoryPattern.SimpleFactory.Shape;

/**
 * @Author xujianfeng
 * @DATE 2023/6/29 11:20
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
