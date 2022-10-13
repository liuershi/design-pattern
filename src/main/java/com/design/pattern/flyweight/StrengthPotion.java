package com.design.pattern.flyweight;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhangwei151
 * @date 2022/10/13 15:35
 */
@Slf4j
public class StrengthPotion implements Potion {
    @Override
    public void drink() {
        log.info("You fell strong. (Potion={})", System.identityHashCode(this));
    }
}
