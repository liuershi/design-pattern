package com.design.pattern.prototype;

/**
 * Interface for the factory class.
 *
 * @author zhangwei151
 * @date 2022/9/13 11:40
 */
public interface HeroFactory {

    Mage createMage();

    Beast createBeast();

    Warlord createWarlord();
}
