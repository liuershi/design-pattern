package com.design.pattern.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * Decorator that adds a club for the troll.
 *
 * @author zhangwei151
 * @date 2022/9/25 22:04
 */
@Slf4j
public class ClubbedTroll implements Troll {
    /**
     * 实现对Troll的装饰，在本例子中通过方法增强，在实际开发中，可以在本例中
     * 新增额外方法装饰
     */
    private final Troll troll;

    public ClubbedTroll(Troll troll) {
        this.troll = troll;
    }

    @Override
    public void attack() {
        troll.attack();
        log.info("The troll swings at you with a club!");
    }

    @Override
    public int getAttackPower() {
        return troll.getAttackPower() + 11;
    }

    @Override
    public void fleeBattle() {
        troll.fleeBattle();
    }
}
