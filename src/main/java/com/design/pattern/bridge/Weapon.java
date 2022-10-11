package com.design.pattern.bridge;

/**
 * Weapon interface.
 *
 * @author zhangwei151
 * @date 2022/10/11 15:21
 */
public interface Weapon {

    void wield();

    void swing();

    void unwield();

    Enchantment getEnchantment();
}
