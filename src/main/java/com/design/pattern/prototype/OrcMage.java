package com.design.pattern.prototype;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

/**
 * @author zhangwei151
 * @date 2022/9/13 11:24
 */
@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
public class OrcMage extends Mage {

    private final String weapon;

    public OrcMage(OrcMage mage) {
        super(mage);
        this.weapon = mage.weapon;
    }

    @Override
    public String toString() {
        return "Orcish mage attacks with " + weapon;
    }
}
