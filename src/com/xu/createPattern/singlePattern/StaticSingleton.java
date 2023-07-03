package com.xu.createPattern.singlePattern;

/**
 * @Author xujianfeng
 * @DATE 2023/6/29 9:18
 */
public class StaticSingleton {
    private static class SingletonHolder {
        private static final StaticSingleton INSTANCE = new StaticSingleton();
    }

    private StaticSingleton() {
    }

    public static final StaticSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void showMessage() {
        System.out.println("StaticSingleton-》Object:" + SingletonHolder.INSTANCE);
    }
}
