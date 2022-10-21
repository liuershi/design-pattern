package com.design.pattern.observer;

import com.design.pattern.observer.generic.GHobbits;
import com.design.pattern.observer.generic.GOrcs;
import com.design.pattern.observer.generic.GWeather;
import lombok.extern.slf4j.Slf4j;

/**
 * @author zhangwei151
 * @date 2022/10/20 18:20
 */
@Slf4j
public class App {

    /**
     * Program entry point.
     *
     * @param args
     */
    public static void main(String[] args) {
        var weather = new Weather();
        weather.addObserver(new Orcs());
        weather.addObserver(new Hobbits());

        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
        weather.timePasses();

        log.info("--running generic version--");
        var gWeather = new GWeather();
        gWeather.addObserver(new GOrcs());
        gWeather.addObserver(new GHobbits());
        gWeather.timePasses();
        gWeather.timePasses();
        gWeather.timePasses();
    }
}
