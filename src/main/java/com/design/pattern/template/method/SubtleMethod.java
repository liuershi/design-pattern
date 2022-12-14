package com.design.pattern.template.method;

import lombok.extern.slf4j.Slf4j;

/**
 * SubtleMethod implementation of {@link StealingMethod}
 *
 * @author zhangwei151
 * @date 2022/11/28 14:53
 */
@Slf4j
public class SubtleMethod extends StealingMethod {
    @Override
    protected String pickTarget() {
        return "shop keeper";
    }

    @Override
    protected void confuseTarget(String target) {
        log.info("Approach the {} with tears the running and hug him!", target);
    }

    @Override
    protected void stealTheItem(String target) {
        log.info("While in close contact grab the {}'s wallet.", target);
    }
}
