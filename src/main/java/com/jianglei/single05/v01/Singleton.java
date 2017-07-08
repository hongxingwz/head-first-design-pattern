package com.jianglei.single05.v01;

/**
 * Created by jianglei on 2017/7/8.
 * 懒汉模式，线程不安全
 */
public class Singleton {
    private static Singleton uniqueInstance;
    
    private Singleton() {
        
    }
    
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }

        return uniqueInstance;
    }
    
}
