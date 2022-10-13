package com.design.pattern.flyweight;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhangwei151
 * @date 2022/10/13 15:25
 */
@Slf4j
public class InvisibilityPotion implements Potion {
    @Override
    public void drink() {
        log.info("You become invisible. (Option={})", System.identityHashCode(this));
    }
}
