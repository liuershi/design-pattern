package com.design.pattern.observer;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * WeatherType enumeration
 *
 * @author zhangwei151
 * @date 2022/10/20 18:08
 */
@AllArgsConstructor
@Getter
public enum WeatherType {
    SUNNY("sunny"),
    RAINY("rainy"),
    WINDY("windy"),
    COLD("cold");

    private final String description;


    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
