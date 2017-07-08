package com.jianglei.strategy01.v03;

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

    //version02 added
    //but add this method make some problem
    public String fly() {
        return "duck can fly";
    }

}
