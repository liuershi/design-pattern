package com.design.pattern.observer;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhangwei151
 * @date 2022/10/20 18:13
 */
@Slf4j
public class Hobbits implements WeatherObserver {
    @Override
    public void update(WeatherType weatherType) {
        log.info("The hobbits are facing {} weather now", weatherType.getDescription());
    }
}
