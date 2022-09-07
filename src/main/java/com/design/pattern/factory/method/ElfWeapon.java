package com.design.pattern.factory.method;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author zhangwei151
 * @date 2022/9/7 13:48
 */
@Getter
@RequiredArgsConstructor
public class ElfWeapon implements Weapon {

    private final WeaponType weaponType;

    @Override
    public WeaponType getWeaponType() {
        return weaponType;
    }

    @Override
    public String toString() {
        return "an elven" + weaponType;
    }
}
