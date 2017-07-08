package com.jianglei.observer02.v01;

import com.jianglei.observer02.v01.CurrentConditionsDisplay;
import com.jianglei.observer02.v01.WeatherData;
import org.junit.Test;

/**
 * Created by jianglei on 2017/7/8.
 */
public class WeatherDataTest {

    @Test
    public void testMeasurementsChanged() throws InterruptedException {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);
        CurrentConditionsDisplay currentConditionsDisplay1 =
                new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        Thread.sleep(2000);
        weatherData.setMeasurements(82, 70, 29.2f);
        Thread.sleep(2000);
        weatherData.setMeasurements(78, 90, 29.4f);


    }
}
