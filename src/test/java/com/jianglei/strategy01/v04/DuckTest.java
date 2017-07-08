package com.jianglei.strategy01.v04;



import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jianglei on 2017/7/8.
 */
public class DuckTest {
    private Duck mallardDuck;
    private Duck redheadDuck;
    private Duck rubberDuck;
    private Duck decoyDuck;

    @Before
    public void init() {
        mallardDuck = new MallardDuck();
        redheadDuck = new RedheadDuck();
        rubberDuck = new RubberDuck();
        decoyDuck = new DecoyDuck();
    }

    @Test
    public void testDuck() {
        final String expected = "duck can quack.";
        assertEquals(
                expected, mallardDuck.quack());
        assertEquals(
                expected, redheadDuck.quack());
        assertEquals(
                "zhi zhi.", rubberDuck.quack());
        assertEquals(
                "", decoyDuck.quack());

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
                "My head color is red.", redheadDuck.display());
        assertEquals(
                "My head color is green.", mallardDuck.display());
        assertEquals(
                "rubber duck", rubberDuck.display());
        assertEquals(
                "decoy duck", decoyDuck.display());
    }

    @Test
    public void testFly() {
        final String expected = "duck can fly";
        assertEquals(
                expected, mallardDuck.fly());
        assertEquals(
                expected, redheadDuck.fly());

        assertEquals(
                "", rubberDuck.fly());
        assertEquals(
                "", decoyDuck.fly());
    }


}
