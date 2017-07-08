package com.jianglei.strategy01.v05;

/**
 * Created by jianglei on 2017/7/8.
 */
public class MallardDuck extends Duck implements Flyable, Quackable {
    @Override
    public String fly() {
        return "duck can fly";
    }

    @Override
    public String quack() {
        return "duck can quack";
    }

    @Override
    public String display() {
        return "my head color is green";
    }
}
