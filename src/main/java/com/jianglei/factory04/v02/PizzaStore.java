package com.jianglei.factory04.v02;

/**
 * Created by jianglei on 2017/7/9.
 */
public abstract class PizzaStore {



    Pizza orderPizza(String type){
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        System.out.println("--------------");
        return pizza;

    }

    abstract Pizza  createPizza(String type);
}
