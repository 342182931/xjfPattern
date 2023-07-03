package com.xu.pattern.prototypePattern;

/**
 * 主要解决：在运行期建立和删除原型。
 *
 * @Author xujianfeng
 * @DATE 2023/6/29 11:37
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType() + clonedShape);

        Shape clonedShape4 = (Shape) ShapeCache.getShape("1");
        System.out.println("clonedShape4 : " + clonedShape4.getType() + clonedShape4);

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType() + clonedShape2);

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
