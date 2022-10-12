package com.design.pattern.facade;

import lombok.extern.slf4j.Slf4j;

/**
 * DwarvenTunnelDigger is one of the goldmine subsystems.
 *
 * @author zhangwei151
 * @date 2022/10/12 15:01
 */
@Slf4j
public class DwarvenTunnelDigger extends DwarvenMineWorker {
    @Override
    protected String name() {
        return "Dwarven tunnel digger";
    }

    @Override
    protected void work() {
        log.info("{} creates another promising tunnel.", name());
    }
}
