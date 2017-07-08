package com.jianglei.strategy01.v04;

/**
 * Created by jianglei on 2017/7/8.
 * 继承带来的问题，橡胶照鸭子本不应该会飞，但是继承Duck时也继承了fly方法
 * 可以重写fly()方法，使其什么也不作
 */
public class RubberDuck extends Duck {
    @Override
    public String quack() {
        return "zhi zhi.";
    }

    @Override
    public String display() {
        return "rubber duck";
    }

    @Override
    public String fly() {
        return "";
    }
}
