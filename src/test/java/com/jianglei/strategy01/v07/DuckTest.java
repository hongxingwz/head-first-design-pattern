package com.jianglei.strategy01.v07;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jianglei on 2017/7/8.
 */
public class DuckTest {
    private Duck mallardDuck;

    @Before
    public void init() {
        mallardDuck = new MallardDuck();
        mallardDuck.setFlyBehavior(new FlyNoWay());
        mallardDuck.setQuackBehavior(new MuteQuack());
    }

    @Test
    public void testMethod() {
        assertEquals(
                "duck can swim", mallardDuck.swim());
        assertEquals(
                "", mallardDuck.performFly());
        assertEquals(
                "", mallardDuck.performQuack());
        assertEquals(
                "I'm a real Mallard duck", mallardDuck.display());

        mallardDuck.setFlyBehavior(new FlyWithRocket());
        assertEquals(
                "I'm flying with rocket", mallardDuck.performFly());

    }
}
