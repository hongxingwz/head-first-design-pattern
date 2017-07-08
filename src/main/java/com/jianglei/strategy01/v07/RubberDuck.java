package com.jianglei.strategy01.v07;

/**
 * Created by jianglei on 2017/7/8.
 */
public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public String display() {
        return "I'm a real Rubber duck";
    }
}
