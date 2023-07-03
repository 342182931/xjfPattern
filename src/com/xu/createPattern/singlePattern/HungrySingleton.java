package com.xu.createPattern.singlePattern;

/**
 * @Author xujianfeng
 * @DATE 2023/6/28 15:41
 */
public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }

    public void showMessage(){
        System.out.println("hungrySingleton-》Object:"+instance);
    }
}
