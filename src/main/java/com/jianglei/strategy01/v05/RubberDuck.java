package com.jianglei.strategy01.v05;

/**
 * Created by jianglei on 2017/7/8.
 */
public class RubberDuck extends Duck implements Quackable {
    @Override
    public String quack() {
        return "zhi zhi";
    }

    @Override
    public String display() {
        return "rubber duck";
    }
}
