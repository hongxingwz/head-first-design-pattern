package com.jianglei.observer02.v02;

import org.junit.Test;

import java.util.Observable;

/**
 * Created by jianglei on 2017/7/9.
 */
public class WeatherDataTest {

    @Test
    public void test01() throws InterruptedException {
        Observable observable = new WeatherData();
        for(int i = 0; i < 10; i++) {
            new CurrentConditionsDisplay(observable);
        }
        double num = 20.0f;
        WeatherData weatherData = (WeatherData) observable;
        for(int i = 0; i < 10; i++) {
            weatherData.setMeasurements((float)num++, (float)num++, (float)num++);
            System.out.println("---------------------");
            Thread.sleep(1500);
        }


    }
}
