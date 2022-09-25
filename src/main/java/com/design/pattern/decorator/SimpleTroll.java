package com.design.pattern.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * SimpleTroll implements {@link Troll} interface directly.
 *
 * @author zhangwei151
 * @date 2022/9/25 21:59
 */
@Slf4j
public class SimpleTroll implements Troll {
    @Override
    public void attack() {
        log.info("The troll tries to grab you.");
    }

    @Override
    public int getAttackPower() {
        return 10;
    }

    @Override
    public void fleeBattle() {
        log.info("The troll shrieks in horror and runs away!");
    }
}
