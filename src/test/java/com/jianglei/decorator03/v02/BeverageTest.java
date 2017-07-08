package com.jianglei.decorator03.v02;

import com.jianglei.decorator03.v02.*;
import org.junit.Test;

/**
 * Created by jianglei on 2017/7/9.
 */
public class BeverageTest {

    @Test
    public void testCost() {
        Beverage beverage = new Espreeso(new DarkRoast());
        System.out.println(beverage.getDescription() +
                        " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        Mocha mocha = new Mocha(beverage2);
        Mocha mocha1 = new Mocha(mocha);
        Whip whip = new Whip(mocha1);

        System.out.println(whip.getDescription() +
                        " $" + whip.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() +
                        " $" + beverage3.cost());

    }
}
