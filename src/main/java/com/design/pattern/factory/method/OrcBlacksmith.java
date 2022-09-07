package com.design.pattern.factory.method;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/**
 * Concrete subclass for creating new objects.
 *
 * @author zhangwei151
 * @date 2022/9/7 13:59
 */
public class OrcBlacksmith implements Blacksmith {

    private final Map<WeaponType, OrcWeapon> ORCARSENAL;

    public OrcBlacksmith() {
        this.ORCARSENAL = new EnumMap<WeaponType, OrcWeapon>(WeaponType.class);
        Arrays.stream(WeaponType.values()).forEach(type -> ORCARSENAL.put(type, new OrcWeapon(type)));
    }

    @Override
    public Weapon manufactureWeapon(WeaponType weaponType) {
        return ORCARSENAL.get(weaponType);
    }

    @Override
    public String toString() {
        return "The orc blacksmith";
    }
}
