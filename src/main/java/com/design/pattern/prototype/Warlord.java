package com.design.pattern.prototype;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author zhangwei151
 * @date 2022/9/13 11:07
 */
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public abstract class Warlord extends Prototype<Warlord> {

    public Warlord(Warlord source) {
    }
}
