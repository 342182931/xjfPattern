package com.xu.pattern.singlePattern;

/**
 * @Author xujianfeng
 * @DATE 2023/6/28 15:41
 */
public class DoubleCheckSingleton {
    private volatile static DoubleCheckSingleton instance;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("DoubleCheckSingleton-》Object:" + instance);
    }
}
