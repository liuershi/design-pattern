package com.design.pattern.template.method;

/**
 * StealingMethod defined skeleton for the algorithm.
 *
 * @author zhangwei151
 * @date 2022/11/28 14:51
 */
public abstract class StealingMethod {

    protected abstract String pickTarget();

    protected abstract void confuseTarget(String target);

    protected abstract void stealTheItem(String target);

    /**
     * Steal.
     */
    public final void steal() {
        var target = pickTarget();
        confuseTarget(target);
        stealTheItem(target);
    }
}
