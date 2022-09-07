package com.design.pattern.simple.factory;

/**
 * 具体产品实现-银币
 *
 * @author zhangwei151
 * @date 2022/9/7 11:06
 */
public class CopperCoin implements Coin{

    private final String DESCRIPTION = "this is a copper coin";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
