package com.xu.createPattern.factoryPattern.AbstractFactory;

/**
 * 生成器
 * @Author xujianfeng
 * @DATE 2023/6/29 11:23
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
