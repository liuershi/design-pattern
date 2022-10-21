package com.design.pattern.observer.generic;

import com.design.pattern.observer.WeatherType;
import lombok.extern.slf4j.Slf4j;

/**
 * @author zhangwei151
 * @date 2022/10/21 9:06
 */
@Slf4j
public class GHobbits implements Race {
    @Override
    public void update(GWeather subject, WeatherType weatherType) {
        log.info("The hobbits are facing " + weatherType.getDescription() + " weather now");
    }
}
