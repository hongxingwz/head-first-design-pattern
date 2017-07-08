package com.jianglei.strategy01.v07;

/**
 * Created by jianglei on 2017/7/8.
 */
public class FlyWithRocket implements FlyBehavior{
    @Override
    public String fly() {
        return "I'm flying with rocket";
    }
}
