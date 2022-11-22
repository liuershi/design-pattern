package com.design.pattern.command;

import java.util.Deque;
import java.util.LinkedList;

/**
 *
 *
 * @author zhangwei151
 * @date 2022/11/22 9:52
 */
public class Wizard {

    private final Deque<Runnable> redoDeque = new LinkedList<>();
    private final Deque<Runnable> undoDeque = new LinkedList<>();

    /**
     * cast spell
     * @param runnable
     */
    public void castSpell(Runnable runnable) {
        runnable.run();
        undoDeque.offerLast(runnable);
    }

    /**
     * undo last spell
     */
    public void undoLastSpell() {
        if (!undoDeque.isEmpty()) {
            var runnable = undoDeque.pollLast();
            redoDeque.offerLast(runnable);
            runnable.run();
        }
    }

    /**
     * redo last spell
     */
    public void redoLastSpell() {
        if (!redoDeque.isEmpty()) {
            var runnable = redoDeque.pollLast();
            undoDeque.offerLast(runnable);
            runnable.run();
        }
    }

    @Override
    public String toString() {
        return "Wizard";
    }
}
