package com.design.pattern.factory.method;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/**
 * Concrete subclass for creating new objects.
 *
 * @author zhangwei151
 * @date 2022/9/7 13:50
 */
public class ElfBlacksmith implements Blacksmith {

    private final Map<WeaponType, ElfWeapon> ELFARSENAL;

    public ElfBlacksmith() {
        this.ELFARSENAL = new EnumMap<>(WeaponType.class);
        Arrays.stream(WeaponType.values()).forEach(type -> ELFARSENAL.put(type, new ElfWeapon(type)));
    }

    @Override
    public Weapon manufactureWeapon(WeaponType weaponType) {
        return ELFARSENAL.get(weaponType);
    }

    @Override
    public String toString() {
        return "The elf blacksmith";
    }
}
