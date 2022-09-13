package com.design.pattern.prototype;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

/**
 * @author zhangwei151
 * @date 2022/9/13 11:35
 */
@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
public class OrcWarlord extends Warlord {

    private final String weapon;

    public OrcWarlord(OrcWarlord warlord) {
        super(warlord);
        this.weapon = warlord.weapon;
    }

    @Override
    public String toString() {
        return "Orcish warlord attacks with " + weapon;
    }
}
