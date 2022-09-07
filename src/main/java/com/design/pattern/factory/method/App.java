package com.design.pattern.factory.method;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhangwei151
 * @date 2022/9/7 14:17
 */
@Slf4j
public class App {

    private static final String MANUFACTURED = "{} manufactured {}";

    public static void main(String[] args) {
        Blacksmith blacksmith = new ElfBlacksmith();
        var weapon = blacksmith.manufactureWeapon(WeaponType.SPEAR);
        log.info(MANUFACTURED, blacksmith, weapon);
        weapon = blacksmith.manufactureWeapon(WeaponType.SHORT_SWORD);
        log.info(MANUFACTURED, blacksmith, weapon);

        blacksmith = new OrcBlacksmith();
        weapon = blacksmith.manufactureWeapon(WeaponType.SPEAR);
        log.info(MANUFACTURED, blacksmith, weapon);
        weapon = blacksmith.manufactureWeapon(WeaponType.SHORT_SWORD);
        log.info(MANUFACTURED, blacksmith, weapon);
    }
}
