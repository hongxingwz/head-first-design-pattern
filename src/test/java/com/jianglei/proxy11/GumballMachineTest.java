package com.jianglei.proxy11;

import org.junit.Test;

/**
 * Created by jianglei on 2017/7/9.
 */
public class GumballMachineTest {

    @Test
    public void test01() {
        GumballMonitor gumballMonitor = new GumballMonitor(new GumballMachine("hb", 2));
        gumballMonitor.report();

    }
}
