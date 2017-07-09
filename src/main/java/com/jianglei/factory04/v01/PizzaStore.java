package com.jianglei.factory04.v01;

/**
 * Created by jianglei on 2017/7/9.
 */
public class PizzaStore {
    SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    Pizza orderPizza(String type){
        Pizza pizza;

        pizza = simplePizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        System.out.println("--------------");
        return pizza;

    }
}
