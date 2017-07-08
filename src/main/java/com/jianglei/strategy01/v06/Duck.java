package com.jianglei.strategy01.v06;

/**
 * Created by jianglei on 2017/7/8.
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public String performQuack() {
        return quackBehavior.quack();
    }
    public abstract String display();

    public String performFly() {
        return flyBehavior.fly();
    }
    public String swim() {
        return "duck can swim";
    }

}
