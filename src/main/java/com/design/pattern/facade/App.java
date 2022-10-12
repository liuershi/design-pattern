package com.design.pattern.facade;

/**
 * @author zhangwei151
 * @date 2022/10/12 15:15
 */
public class App {

    /**
     * program entry point.
     *
     * @param args
     */
    public static void main(String[] args) {
        var facade = new DwarvenGoldmineFacade();
        facade.startNewDay();
        facade.startOutGold();
        facade.endDay();
    }
}
