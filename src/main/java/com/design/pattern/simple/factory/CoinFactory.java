package com.design.pattern.simple.factory;

/**
 * factory class
 * @author zhangwei151
 * @date 2022/9/7 11:10
 */
public class CoinFactory {

    /**
     * Factory method takes as a parameter the coin type and calls the appropriate class.
     */
    public static Coin getCoin(CoinType coinType) {
        return coinType.getSupplier().get();
    }
}
