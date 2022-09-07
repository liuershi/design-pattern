package com.design.pattern.factory.method;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Weapon enumeration.
 *
 * @author zhangwei151
 * @date 2022/9/7 11:40
 */
@Getter
@RequiredArgsConstructor
public enum WeaponType {
    SHORT_SWORD("short sword"),
    SPEAR("spear"),
    AXE("axe"),
    UNDEFINED("undefined");

    private final String title;

    @Override
    public String toString() {
        return title;
    }
}
