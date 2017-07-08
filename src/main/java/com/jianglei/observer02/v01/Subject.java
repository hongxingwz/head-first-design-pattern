package com.jianglei.observer02.v01;

/**
 * Created by jianglei on 2017/7/8.
 */
public interface Subject {
    void registerObserver(Observer observer);

    void removeObjserver(Observer observer);

    void notifyObjservers();
}
