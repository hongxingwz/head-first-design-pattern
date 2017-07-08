package com.jianglei.single05.v06;

import org.junit.Test;

/**
 * Created by jianglei on 2017/7/8.
 */
public class SingletonTest {

    @Test
    public void testInitializer() throws ClassNotFoundException {
        Class<?> aClass = Class.forName("com.jianglei.single05.v06.Singleton");
    }
    @Test
    public void testGetInstance() {
        Singleton instance = Singleton.getInstance();
    }
}
