package com.jianglei.single05.v03;

/**
 * Created by jianglei on 2017/7/8.
 * 饿汉式，类加载就实例化，可能造成不必要的资源浪费
 */
public class Singleton {
    private static Singleton uniqueSingletion = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return uniqueSingletion;
    }
}
