package com.design.pattern.prototype;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

/**
 * @author zhangwei151
 * @date 2022/9/13 11:20
 */
@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
public class ElfWarlord extends Warlord {

    private final String helpType;

    public ElfWarlord(ElfWarlord warlord) {
        super(warlord);
        this.helpType = warlord.helpType;
    }

    @Override
    public String toString() {
        return "Elven warlord helps in " + helpType;
    }
}
