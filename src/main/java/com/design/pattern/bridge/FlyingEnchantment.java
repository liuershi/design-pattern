package com.design.pattern.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhangwei151
 * @date 2022/10/11 15:46
 */
@Slf4j
public class FlyingEnchantment implements Enchantment {
    @Override
    public void onActive() {
        log.info("The item begins to glow faintly.");
    }

    @Override
    public void apply() {
        log.info("The item flies and strikes the enemies finally returning to owner's hand.");
    }

    @Override
    public void onDeactivate() {
        log.info("The item's glow fades.");
    }
}
