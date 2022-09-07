package com.design.pattern.simple.factory;

/**
 * 具体产品实现-金币
 *
 * @author zhangwei151
 * @date 2022/9/7 11:02
 */
public class GoldCoin implements Coin{

    private final String DESCRIPTION = "this is a gold coin";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
