package com.jianglei.single05.v02;

/**
 * Created by jianglei on 2017/7/8.
 * 懒汉式，在getInstance()方法加上了同步，效率低下
 */
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {
    }

    public synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }

        return uniqueInstance;
    }
}
