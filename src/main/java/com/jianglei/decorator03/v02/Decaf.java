package com.jianglei.decorator03.v02;

/**
 * Created by jianglei on 2017/7/9.
 */
public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
