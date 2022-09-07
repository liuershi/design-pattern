package com.design.pattern.simple.factory;

import lombok.extern.slf4j.Slf4j;
import lombok.var;

/**
 * @author zhangwei151
 * @date 2022/9/7 11:15
 */
@Slf4j
public class App {

    public static void main(String[] args) {
        log.info("start simple factory work.");
        var goldCoin = CoinFactory.getCoin(CoinType.GOLD_COIN);
        var copperCoin = CoinFactory.getCoin(CoinType.COPPER_COIN);
        log.info(goldCoin.getDescription());
        log.info(copperCoin.getDescription());
    }
}
