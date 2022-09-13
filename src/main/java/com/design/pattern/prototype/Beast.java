package com.design.pattern.prototype;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Beast
 *
 * @author zhangwei151
 * @date 2022/9/13 11:05
 */
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public abstract class Beast extends Prototype<Beast> {

    public Beast(Beast source) {
    }
}
