package com.jianglei.adapter07;

import com.jianglei.adapter07.v01.*;
import org.junit.Test;

/**
 * Created by jianglei on 2017/7/9.
 */
public class TurkeyAdapterTest {

    @Test
    public void test01() {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println();
        System.out.println("The Duck says....");
        duck.quack();
        duck.fly();

        System.out.println();
        System.out.println("The TurkeyAdapter says....");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }

    @Test
    public void test02() {
        DuckAdapter duckAdapter = new DuckAdapter(new MallardDuck());
        duckAdapter.gobble();
        duckAdapter.fly();
    }
}
