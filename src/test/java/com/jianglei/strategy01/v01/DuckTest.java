package com.jianglei.strategy01.v01;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jianglei on 2017/7/8.
 */
public class DuckTest {
    private Duck mallardDuck;
    private Duck redheadDuck;

    @Before
    public void init() {
        mallardDuck = new MallardDuck();
        redheadDuck = new RedheadDuck();
    }

    @Test
    public void testDuck() {
        final String expected = "duck can quack.";
        assertEquals(
                expected, mallardDuck.quack());
        assertEquals(
                expected, redheadDuck.quack());
    }

    @Test
    public void testSwim() {
        final String expected = "duck can swim.";
        assertEquals(
                expected, mallardDuck.swim());
        assertEquals(
                expected, redheadDuck.swim());
    }

    @Test
    public void testDisplay() {
        assertEquals(
                "My head color is red.", redheadDuck.display());
        assertEquals("My head color is green.", mallardDuck.display());
    }
}
