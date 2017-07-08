package com.jianglei.single05.v01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jianglei on 2017/7/8.
 */
public class SingletonTest {

    @Test
    public void testGetInstance() {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();

        assertEquals(instance.hashCode(), instance1.hashCode());
    }
}
