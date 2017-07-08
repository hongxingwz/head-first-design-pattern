package com.jianglei.decorator03.v02;

/**
 * Created by jianglei on 2017/7/9.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
