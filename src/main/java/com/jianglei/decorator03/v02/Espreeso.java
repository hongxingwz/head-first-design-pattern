package com.jianglei.decorator03.v02;

/**
 * Created by jianglei on 2017/7/9.
 */
public class Espreeso extends Beverage {

    private DarkRoast darkRoast;


    public Espreeso(DarkRoast darkRoast) {
        this.darkRoast = darkRoast;
        description = this.darkRoast.getDescription() + ", Espresso";
    }



    @Override
    public double cost() {
        return 1.99;
    }
}
