package com.xu.structurePattern.bridgePattern;

/**
 * @Author xujianfeng
 * @DATE 2023/7/3 16:57
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
