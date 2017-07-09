package com.jianglei.factory04.v02;

/**
 * Created by jianglei on 2017/7/9.
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type){
        switch (type) {
            case "cheese":
                return new NYStyleCheesePizza();
            case "veggie":
                return new VeggiePizza();
            case "clam":
                return new ClamPizza();
            case "pepperoni":
                return new PepperoniPizza();
            default:
                return null;
        }
    }
}
