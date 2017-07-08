package com.jianglei.strategy01.v07;

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

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
