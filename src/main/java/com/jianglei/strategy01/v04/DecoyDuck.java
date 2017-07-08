package com.jianglei.strategy01.v04;

/**
 * Created by jianglei on 2017/7/8.
 * 诱饵鸭 不会叫 也不会飞
 */
public class DecoyDuck extends Duck{
    @Override
    public String quack() {
        return "";
    }

    @Override
    public String display() {
        return "decoy duck";
    }

    @Override
    public String fly() {
        return "";
    }
}
