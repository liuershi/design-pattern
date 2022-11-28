package com.design.pattern.iterator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhangwei151
 * @date 2022/11/28 11:03
 */
@Slf4j
public class App {

    /**
     * Program entry point.
     *
     * @param args
     */
    public static void main(String[] args) {
        var chest = new TreasureChest();
        var iterator = chest.iterator(ItemType.RING);
        while (iterator.hasNext()) {
            log.info("current item {}", iterator.next());
        }
    }
}
