package com.design.pattern.prototype;

import lombok.RequiredArgsConstructor;

/**
 * Concrete factory class.
 *
 * @author zhangwei151
 * @date 2022/9/13 11:42
 */
@RequiredArgsConstructor
public class HeroFactoryImpl implements HeroFactory {

    private final Mage mage;
    private final Beast beast;
    private final Warlord warlord;

    public Mage createMage() {
        return mage.copy();
    }

    public Beast createBeast() {
        return beast.copy();
    }

    public Warlord createWarlord() {
        return warlord.copy();
    }
}
