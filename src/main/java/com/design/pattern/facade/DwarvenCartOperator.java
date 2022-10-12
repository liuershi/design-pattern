package com.design.pattern.facade;

import lombok.extern.slf4j.Slf4j;

/**
 * DwarvenCartOperator is one of the goldmine subsystems.
 *
 * @author zhangwei151
 * @date 2022/10/12 15:06
 */
@Slf4j
public class DwarvenCartOperator extends DwarvenMineWorker {
    @Override
    protected String name() {
        return "Dwarf cart operator";
    }

    @Override
    protected void work() {
        log.info("{} move gold chunks out of the mine.", name());
    }
}
