package com.design.pattern.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhangwei151
 * @date 2022/10/11 15:27
 */
@Slf4j
public class Sword implements Weapon {

    private final Enchantment enchantment;

    public Sword(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void wield() {
        log.info("The sword is wield.");
        enchantment.onActive();
    }

    @Override
    public void swing() {
        log.info("The sword is swinged.");
        enchantment.apply();
    }

    @Override
    public void unwield() {
        log.info("The sword is unwielded.");
        enchantment.onDeactivate();
    }

    @Override
    public Enchantment getEnchantment() {
        return enchantment;
    }
}
