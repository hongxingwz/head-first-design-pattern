package com.jianglei.strategy01.v05;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jianglei on 2017/7/8.
 */
public class DuckTest {
    private MallardDuck mallardDuck;
    private RedheadDuck redheadDuck;
    private RubberDuck rubberDuck;
    private DecoyDuck decoyDuck;

    @Before
    public void init() {
        mallardDuck = new MallardDuck();
        redheadDuck = new RedheadDuck();
        rubberDuck = new RubberDuck();
        decoyDuck = new DecoyDuck();
    }

    @Test
    public void testSwim() {
        final String expected = "duck can swim.";
        assertEquals(
                expected, mallardDuck.swim());
        assertEquals(
                expected, redheadDuck.swim());
        assertEquals(
                expected, rubberDuck.swim());
        assertEquals(
                expected, decoyDuck.swim());
    }

    @Test
    public void testDisplay() {
        assertEquals(
                "my head color is green", mallardDuck.display());
        assertEquals(
                "my head color is red", redheadDuck.display());
        assertEquals(
                "rubber duck", rubberDuck.display());
        assertEquals(
                "decoy duck", decoyDuck.display());
    }

    @Test
    public void testQuack() {
        assertEquals("duck can quack", mallardDuck.quack());
        assertEquals("duck can quack", redheadDuck.quack());
        assertEquals("zhi zhi", rubberDuck.quack());
    }

    @Test
    public void testFly() {
        assertEquals("duck can fly", mallardDuck.fly());
        assertEquals("duck can fly", redheadDuck.fly());
    }
}
