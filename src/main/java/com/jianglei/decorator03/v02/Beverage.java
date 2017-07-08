package com.jianglei.decorator03.v02;

/**
 * Created by jianglei on 2017/7/9.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();


}
