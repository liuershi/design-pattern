package com.design.pattern.observer.generic;

import com.design.pattern.observer.WeatherType;
import lombok.extern.slf4j.Slf4j;

/**
 * @author zhangwei151
 * @date 2022/10/21 9:05
 */
@Slf4j
public class GOrcs implements Race {
    @Override
    public void update(GWeather subject, WeatherType weatherType) {
        log.info("The orcs are facing " + weatherType.getDescription() + " weather now");
    }
}
