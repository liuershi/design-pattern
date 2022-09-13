package com.design.pattern.prototype;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

/**
 * @author zhangwei151
 * @date 2022/9/13 11:22
 */
@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
public class OrcBeast extends Beast {

    private final String weapon;

    public OrcBeast(OrcBeast beast) {
        super(beast);
        this.weapon = beast.weapon;
    }

    @Override
    public String toString() {
        return "Orcish wolf attacks with " + weapon;
    }
}
