package com.xu.createPattern.singlePattern;

/**
 * 懒汉式 线程安全
 *
 * @Author xujianfeng
 * @DATE 2023/6/28 11:36
 */
public class LazySingletonSecurity {
    private static LazySingletonSecurity instance;

    private LazySingletonSecurity() {
    }

    public static synchronized LazySingletonSecurity getInstance() {
        if (instance == null) {
            instance = new LazySingletonSecurity();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("LazySingletonSecurity-》Object:"+instance);
    }
}
