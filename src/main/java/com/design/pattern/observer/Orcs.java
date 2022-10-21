package com.design.pattern.observer;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhangwei151
 * @date 2022/10/20 18:13
 */
@Slf4j
public class Orcs implements WeatherObserver {
    @Override
    public void update(WeatherType weatherType) {
        log.info("The orcs are facing " + weatherType.getDescription() + " weather now");
    }
}
