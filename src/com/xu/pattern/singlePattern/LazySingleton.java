package com.xu.pattern.singlePattern;

/**
 * 懒汉式 线程不安全
 *
 * @Author xujianfeng
 * @DATE 2023/6/28 11:36
 */
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() throws InterruptedException {
        if (instance == null) {
            Thread.sleep(100);
            instance = new LazySingleton();
        }

        return instance;
    }

    public void showMessage(){
        System.out.println("LazySingletonSecurity-》Object:"+instance);
    }
}
