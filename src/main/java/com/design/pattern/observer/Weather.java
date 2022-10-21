package com.design.pattern.observer;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * Weather can be observed by implementing {@link WeatherObserver} interface and
 * registering as listener.
 *
 * @author zhangwei151
 * @date 2022/10/20 18:11
 */
@Slf4j
public class Weather {

    private final List<WeatherObserver> observers;
    private WeatherType currentWeather;

    public Weather() {
        this.observers = new ArrayList<>();
        this.currentWeather = WeatherType.SUNNY;
    }

    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    public void timePasses() {
        var weatherTypes = WeatherType.values();
        this.currentWeather = weatherTypes[(currentWeather.ordinal() + 1) % weatherTypes.length];
        log.info("The weather change to {}", currentWeather);
        notifyObservers();
    }

    private void notifyObservers() {
        observers.forEach(observer -> observer.update(currentWeather));
    }
}
