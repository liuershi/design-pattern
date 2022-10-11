package com.design.pattern.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhangwei151
 * @date 2022/10/11 15:30
 */
@Slf4j
public class Hammer implements Weapon {

    private final Enchantment enchantment;

    public Hammer(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void wield() {
        log.info("The hammer is wielded.");
        enchantment.onActive();
    }

    @Override
    public void swing() {
        log.info("The hammer is swung.");
        enchantment.apply();
    }

    @Override
    public void unwield() {
        log.info("The hammer is unwielded.");
        enchantment.onDeactivate();
    }

    @Override
    public Enchantment getEnchantment() {
        return enchantment;
    }
}
