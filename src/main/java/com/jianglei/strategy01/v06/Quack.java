package com.jianglei.strategy01.v06;

/**
 * Created by jianglei on 2017/7/8.
 */
public class Quack implements QuackBehavior {
    @Override
    public String quack() {
        return "gua gua";
    }
}
