package com.jianglei.adapter07.v01;

/**
 * Created by jianglei on 2017/7/9.
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
