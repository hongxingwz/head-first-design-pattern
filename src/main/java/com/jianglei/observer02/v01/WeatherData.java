package com.jianglei.observer02.v01;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jianglei on 2017/7/8.
 */
public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObjserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i > -1) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObjservers() {
        for(int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObjservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
