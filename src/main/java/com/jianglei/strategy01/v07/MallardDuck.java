package com.jianglei.strategy01.v07;

/**
 * Created by jianglei on 2017/7/8.
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public String display() {
        return "I'm a real Mallard duck";
    }
}
