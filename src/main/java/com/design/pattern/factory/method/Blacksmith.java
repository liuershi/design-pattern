package com.design.pattern.factory.method;

/**
 * The interface container method for producing object.
 *
 * @author zhangwei151
 * @date 2022/9/7 13:45
 */
public interface Blacksmith {

    Weapon manufactureWeapon(WeaponType weaponType);
}
