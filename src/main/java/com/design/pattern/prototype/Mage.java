package com.design.pattern.prototype;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Mage
 *
 * @author zhangwei151
 * @date 2022/9/13 11:06
 */
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public abstract class Mage extends Prototype<Mage> {

    public Mage(Mage source) {
    }
}
