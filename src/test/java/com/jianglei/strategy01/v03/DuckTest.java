package com.jianglei.strategy01.v03;


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

    @Before
    public void init() {
        mallardDuck = new MallardDuck();
        redheadDuck = new RedheadDuck();
        rubberDuck = new RubberDuck();
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
    }

    @Test
    public void testDisplay() {
        assertEquals(
                "My head color is red.", redheadDuck.display());
        assertEquals(
                "My head color is green.", mallardDuck.display());
        assertEquals(
                "rubber duck", rubberDuck.display());
    }

    @Test
    public void testFly() {
        final String expected = "duck can fly";
        assertEquals(
                expected, mallardDuck.fly());
        assertEquals(
                expected, redheadDuck.fly());

        //这里橡胶鸭子本应该不会飞，但是却继承了Duck.fly()方法会飞了
        assertEquals(
                expected, rubberDuck.fly());
    }


}
