package com.jianglei.strategy01.v06;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jianglei on 2017/7/8.
 */
public class DuckTest {
    private static final String SWIM = "duck can swim";

    private Duck mallardDuck;
    private Duck rubberDuck;
    private Duck decoryDuck;

    @Before
    public void init() {
        mallardDuck = new MallardDuck();
        rubberDuck = new RubberDuck();
        decoryDuck = new DecoryDuck();
    }


    @Test
    public void testSwim() {
        assertEquals(
                SWIM, mallardDuck.swim());
        assertEquals(
                SWIM, rubberDuck.swim());
        assertEquals(
                SWIM, decoryDuck.swim());
    }

    @Test
    public void testDisplay() {
        assertEquals(
                "I'm a real Mallard duck", mallardDuck.display());
        assertEquals(
                "I'm a real Rubber duck", rubberDuck.display());
        assertEquals(
                "I'm a real Decory duck", decoryDuck.display());
    }

    @Test
    public void testPerformQuack() {
        assertEquals(
                "gua gua", mallardDuck.performQuack());

        assertEquals(
                "zhi zhi", rubberDuck.performQuack());
        assertEquals(
                "", decoryDuck.performQuack());
    }

    @Test
    public void testPerformFly() {
        assertEquals(
                "can fly", mallardDuck.performFly());

        assertEquals(
                "", rubberDuck.performFly());
        assertEquals(
                "", decoryDuck.performFly());

    }
}
