package com.design.pattern.prototype;

import lombok.extern.slf4j.Slf4j;

/**
 * In this example we have a factory class {@link HeroFactoryImpl} producing objects by
 * cloning the existing ones. the factory's prototype objects are given as constructor parameters.
 * @author zhangwei151
 * @date 2022/9/13 11:45
 */
@Slf4j
public class App {

    public static void main(String[] args) {
        var factory = new HeroFactoryImpl(
                new ElfMage("cooking"),
                new ElfBeast("cleaning"),
                new ElfWarlord("protecting")
        );
        var beast = factory.createBeast();
        var mage = factory.createMage();
        var warlord = factory.createWarlord();
        log.info(beast.toString());
        log.info(mage.toString());
        log.info(warlord.toString());

        factory = new HeroFactoryImpl(
                new OrcMage("axe"),
                new OrcBeast("laser"),
                new OrcWarlord("sword")
        );
        beast = factory.createBeast();
        mage = factory.createMage();
        warlord = factory.createWarlord();
        log.info(beast.toString());
        log.info(mage.toString());
        log.info(warlord.toString());
    }
}
