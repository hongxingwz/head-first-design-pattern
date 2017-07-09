package com.jianglei.proxy11;

/**
 * Created by jianglei on 2017/7/9.
 */
public class GumballMachine {
    String location;
    int count;
    int state;

    public GumballMachine(String location, int count) {
        this.location = location;
        this.count = count;
    }

    public String getLocation() {
        return location;
    }

    public int getCount() {
        return count;
    }

    public int getState() {
        return state;
    }
}
