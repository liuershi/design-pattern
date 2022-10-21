package com.design.pattern.observer;

/**
 * Observer interface.
 *
 * @author zhangwei151
 * @date 2022/10/20 18:12
 */
public interface WeatherObserver {

    void update(WeatherType weatherType);
}
