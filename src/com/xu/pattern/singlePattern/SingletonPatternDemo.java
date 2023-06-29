package com.xu.pattern.singlePattern;

/**
 * 主要解决：一个全局使用的类频繁地创建与销毁。
 *
 * @Author xujianfeng
 * @DATE 2023/6/28 11:38
 */
public class SingletonPatternDemo {
    public static void main(String[] args) throws InterruptedException {

        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //LazySingleton object = new LazySingleton();

        /**
         * 懒汉式线程不安全
         */
        LazySingleton object = LazySingleton.getInstance();
        //显示消息
        object.showMessage();
        LazySingleton object2 = LazySingleton.getInstance();
        object2.showMessage();


        /**
         * 懒汉式线程安全
         */
        LazySingletonSecurity lazySingletonSecurity = LazySingletonSecurity.getInstance();
        //显示消息
        lazySingletonSecurity.showMessage();
        LazySingletonSecurity lazySingletonSecurity2 = LazySingletonSecurity.getInstance();
        lazySingletonSecurity2.showMessage();
        /**
         * 而寒暑
         */
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        //显示消息
        hungrySingleton.showMessage();
        HungrySingleton hungrySingleton2 = HungrySingleton.getInstance();
        hungrySingleton2.showMessage();
        /**
         * DDL双重校验
         */
        DoubleCheckSingleton doubleCheckSingleton = DoubleCheckSingleton.getInstance();
        //显示消息
        doubleCheckSingleton.showMessage();
        DoubleCheckSingleton doubleCheckSingleton2 = DoubleCheckSingleton.getInstance();
        doubleCheckSingleton2.showMessage();
        /**
         * 而寒暑
         */
        StaticSingleton staticSingleton = StaticSingleton.getInstance();
        //显示消息
        staticSingleton.showMessage();
        StaticSingleton staticSingleton2 = StaticSingleton.getInstance();
        staticSingleton2.showMessage();
        /**
         * 而寒暑
         */
        //显示消息
        EnumSingleton.showMessage();
        EnumSingleton.showMessage();

    }
}
