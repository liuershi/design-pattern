package com.design.pattern.facade;

import lombok.extern.slf4j.Slf4j;

import java.util.stream.Stream;

/**
 * Father interface.
 *
 * @author zhangwei151
 * @date 2022/10/12 14:52
 */
@Slf4j
public abstract class DwarvenMineWorker {

    public void goToSleep() {
        log.info("{} goes to sleep.", name());
    }

    public void wakeup() {
        log.info("{} wake up.", name());
    }

    public void goHome() {
        log.info("{} goes home", name());
    }

    public void goToMine() {
        log.info("{} goes to the mine", name());
    }

    public void action(Action action) {
        switch (action) {
            case GO_TO_SLEEP:
                goToSleep();
                break;
            case WAKE_UP:
                wakeup();
                break;
            case GO_HOME:
                goHome();
                break;
            case GO_TO_MINE:
                goToMine();
                break;
            case WORK:
                work();
                break;
            default:
                log.info("Undefined action");
        }
    }

    public void action(Action... actions) {
        Stream.of(actions).forEach(this::action);
    }

    protected abstract String name();

    protected abstract void work();

    enum Action {
        GO_TO_SLEEP, WAKE_UP, GO_HOME, GO_TO_MINE, WORK
    }
}
