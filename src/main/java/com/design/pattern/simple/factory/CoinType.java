package com.design.pattern.simple.factory;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.function.Supplier;

/**
 * @author zhangwei151
 * @date 2022/9/7 11:08
 */
@RequiredArgsConstructor
@Getter
public enum CoinType {
    GOLD_COIN(GoldCoin::new),
    COPPER_COIN(CopperCoin::new);

    private final Supplier<Coin> supplier;
}
