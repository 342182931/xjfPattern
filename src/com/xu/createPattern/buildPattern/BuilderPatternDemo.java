package com.xu.createPattern.buildPattern;

/**
 * 主要解决：主要解决在软件系统中，有时候面临着"一个复杂对象"的创建工作，其通常由各个部分的子对象用一定的算法构成；由于需求的变化，
 * 这个复杂对象的各个部分经常面临着剧烈的变化，但是将它们组合在一起的算法却相对稳定。
 *
 * @Author xujianfeng
 * @DATE 2023/6/28 10:55
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("素食套餐");
        vegMeal.showItems();
        System.out.println("合计: " +vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\n肉食套餐");
        nonVegMeal.showItems();
        System.out.println("合计: " +nonVegMeal.getCost());
    }
}
