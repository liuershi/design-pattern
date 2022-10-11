package com.design.pattern.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhangwei151
 * @date 2022/10/11 15:49
 */
@Slf4j
public class SoulEatingEnchantment implements Enchantment {
    @Override
    public void onActive() {
        log.info("The item spreads bloodlust.");
    }

    @Override
    public void apply() {
        log.info("The item eats the soul of enemies.");
    }

    @Override
    public void onDeactivate() {
        log.info("Bloodlust slowly disappears.");
    }
}
