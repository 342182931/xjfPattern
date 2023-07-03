package com.xu.createPattern.singlePattern;

/**
 * @Author xujianfeng
 * @DATE 2023/6/29 9:22
 */
public class EnumSingleton {

    public void f() {
        System.out.println("DNALI");
    }

    public static EnumSingleton getInstance() {
        return ee.EnumSingleton.enumSingleton;
    }

    public enum ee {
        EnumSingleton;
        public EnumSingleton enumSingleton;
        {
            enumSingleton = new EnumSingleton();
        }
    }

    public static void showMessage() {
        System.out.println("EnumSingleton-》Object:" + ee.EnumSingleton.enumSingleton);
    }

}
