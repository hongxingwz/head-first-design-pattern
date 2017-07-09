package com.jianglei.factory04.v01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jianglei on 2017/7/9.
 */
public class PizzaStoreTest {

    @Test
    public void testCreatePizza() {
        PizzaStore store = new PizzaStore(
                    new SimplePizzaFactory());

        Pizza cheese = store.orderPizza("cheese");
        Pizza pepperoni = store.orderPizza("pepperoni");
        Pizza clam = store.orderPizza("clam");
        Pizza veggie = store.orderPizza("veggie");


        assertEquals(
                "cheese pizza name", cheese.getName());
        assertEquals(
                "pepperoni pizza name", pepperoni.getName());
        assertEquals(
                "clam pizza name", clam.getName());
        assertEquals(
                "veggie pizza name", veggie.getName());


    }
}
