package com.jianglei.single05.v06;

/**
 * Created by jianglei on 2017/7/8.
 */
public class Singleton {
    static {
        System.out.println("Singleton");
    }

    private static class SingletonHolder {
        static{
            System.out.println("Singleton.SingletonHolder");
        }
        private static final Singleton INSTANCE = new Singleton();
    }

    private Singleton() {

    }

    public static final Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
