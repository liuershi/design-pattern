package com.design.pattern.observer.generic;

import com.design.pattern.observer.WeatherType;
import lombok.extern.slf4j.Slf4j;

/**
 * @author zhangwei151
 * @date 2022/10/21 9:02
 */
@Slf4j
public class GWeather extends Observable<GWeather, Race, WeatherType> {

    private WeatherType weatherType;

    public GWeather() {
        this.weatherType = WeatherType.SUNNY;
    }

    public void timePasses() {
        var weatherTypes = WeatherType.values();
        this.weatherType = weatherTypes[(weatherType.ordinal() + 1) % weatherTypes.length];
        log.info("The weather changed to {}", weatherType);
        notifyObservers(weatherType);
    }
}
