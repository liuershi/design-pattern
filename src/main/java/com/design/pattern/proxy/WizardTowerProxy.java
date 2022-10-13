package com.design.pattern.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * The proxy controlling access to the {@link WizardTower}
 *
 * @author zhangwei151
 * @date 2022/10/13 14:02
 */
@Slf4j
public class WizardTowerProxy implements WizardTower {

    private static final int NUM_WIZARD_ALLOWED = 3;

    private int numWizards;

    private final WizardTower target;

    public WizardTowerProxy(WizardTower tower) {
        this.target = tower;
    }

    @Override
    public void enter(Wizard wizard) {
        if (numWizards < NUM_WIZARD_ALLOWED) {
            target.enter(wizard);
            numWizards++;
        } else {
            log.info("{} is not allowed to enter!", wizard);
        }
    }
}
