package com.jianglei.strategy01.v07;

/**
 * Created by jianglei on 2017/7/8.
 */
public class Squeak implements QuackBehavior {
    @Override
    public String quack() {
        return "zhi zhi";
    }
}
