package com.jianglei.strategy01.v01;

/**
 * Created by jianglei on 2017/7/8.
 */
public abstract class Duck {
    public String  quack() {
        return "duck can quack.";
    }

    public String swim() {
        return "duck can swim.";
    }

    public abstract String display();
}
