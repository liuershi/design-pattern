package com.design.pattern.decorator;


import lombok.extern.slf4j.Slf4j;

/**
 * @author zhangwei151
 * @date 2022/9/25 22:10
 */
@Slf4j
public class App {

    /**
     * Program entry point.
     */
    public static void main(String[] args) {
        // simple troll
        log.info("A simple looking troll approaches.");
        var troll = new SimpleTroll();
        troll.attack();
        troll.fleeBattle();
        log.info("Simple troll power : {}.\n", troll.getAttackPower());

        // decorator troll
        // change the behavior of the simple troll by adding a decorator
        log.info("A troll with huge club surprises you.");
        var decoratorTroll = new ClubbedTroll(troll);
        decoratorTroll.attack();
        decoratorTroll.fleeBattle();
        log.info("Clubbed troll power : {}", decoratorTroll.getAttackPower());
    }
}
