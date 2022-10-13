package com.design.pattern.flyweight;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhangwei151
 * @date 2022/10/13 15:22
 */
@Slf4j
public class HealingPotion implements Potion {
    @Override
    public void drink() {
        log.info("You feel healed. (Potion={})", System.identityHashCode(this));
    }
}
