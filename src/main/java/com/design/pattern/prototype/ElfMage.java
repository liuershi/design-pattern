package com.design.pattern.prototype;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

/**
 * @author zhangwei151
 * @date 2022/9/13 11:18
 */
@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
public class ElfMage extends Mage {

    private final String helpType;

    public ElfMage(ElfMage mage) {
        super(mage);
        this.helpType = mage.helpType;
    }

    @Override
    public String toString() {
        return "Elven mage helps in " + helpType;
    }
}
