package com.design.pattern.facade;

import java.util.List;

/**
 * DwarvenGoldmineFacade provides s single interface through which users can
 * operate the subsystems.
 *
 * <p>
 *     This makes the goldmine easier to operate and cuts the dependencies from
 * the goldmine user to the subsystems.
 * </p>
 *
 * @author zhangwei151
 * @date 2022/10/12 15:08
 */
public class DwarvenGoldmineFacade {

    private final List<DwarvenMineWorker> workers;

    public DwarvenGoldmineFacade() {
        this.workers = List.of(
                new DwarvenGoldDigger(),
                new DwarvenCartOperator(),
                new DwarvenTunnelDigger()
        );
    }

    public void startNewDay() {
        makeActions(workers, DwarvenMineWorker.Action.WAKE_UP, DwarvenMineWorker.Action.GO_TO_MINE);
    }

    public void startOutGold() {
        makeActions(workers, DwarvenMineWorker.Action.WORK);
    }

    public void endDay() {
        makeActions(workers, DwarvenMineWorker.Action.GO_HOME, DwarvenMineWorker.Action.GO_TO_SLEEP);
    }

    private void makeActions(List<DwarvenMineWorker> workers, DwarvenMineWorker.Action... actions) {
        workers.forEach(worker -> worker.action(actions));
    }
}
