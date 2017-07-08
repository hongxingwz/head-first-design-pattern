package com.jianglei.single05.v05;

/**
 * Created by jianglei on 2017/7/8.
 * 防止反射实例化私有构造器，所以在实例不为null时抛出异常
 */
public class Singleton {
    private  static volatile Singleton unique;

    private Singleton() throws Exception {
        if (unique != null) {
            throw new Exception("not unique");
        }
    }

    public static Singleton getInstance() throws Exception {
        if (unique == null) {
            synchronized (Singleton.class) {
                if (unique == null) {
                    unique = new Singleton();
                }
            }
        }

        return unique;
    }
}
