package com.jianglei.decorator03.v02;

/**
 * Created by jianglei on 2017/7/9.
 */
public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.40 + beverage.cost();
    }
}
