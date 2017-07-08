package com.jianglei.strategy01.v06;

/**
 * Created by jianglei on 2017/7/8.
 */
public class DecoryDuck extends Duck {
    public DecoryDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public String display() {
        return "I'm a real Decory duck";
    }
}
