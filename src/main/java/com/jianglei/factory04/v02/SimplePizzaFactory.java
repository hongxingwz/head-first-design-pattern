package com.jianglei.factory04.v02;

/**
 * Created by jianglei on 2017/7/9.
 */
public class SimplePizzaFactory {

    Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza =  new CheesePizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            case "clam":
                pizza = new ClamPizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
        }

        return pizza;

    }

}
