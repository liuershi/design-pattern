package com.design.pattern.facade;

import lombok.extern.slf4j.Slf4j;

/**
 * DwarvenGoldDigger is one of the goldmine subsystems.
 *
 * @author zhangwei151
 * @date 2022/10/12 15:04
 */
@Slf4j
public class DwarvenGoldDigger extends DwarvenMineWorker {
    @Override
    protected String name() {
        return "Dwarf gold digger";
    }

    @Override
    protected void work() {
        log.info("{} digs for gold.", name());
    }
}
