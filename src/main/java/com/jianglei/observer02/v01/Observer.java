package com.jianglei.observer02.v01;

/**
 * Created by jianglei on 2017/7/8.
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
