package com.design.pattern.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * The object to be the proxied
 *
 * @author zhangwei151
 * @date 2022/10/13 14:07
 */
@Slf4j
public class IvoryTower implements WizardTower {
    @Override
    public void enter(Wizard wizard) {
        log.info("{} enters the tower.", wizard);
    }
}
