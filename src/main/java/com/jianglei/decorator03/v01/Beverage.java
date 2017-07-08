package com.jianglei.decorator03.v01;

/**
 * Created by jianglei on 2017/7/9.
 */
public abstract class Beverage {
    private String description;

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
