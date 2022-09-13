package com.design.pattern.prototype;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

/**
 * @author zhangwei151
 * @date 2022/9/13 11:11
 */
@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
public class ElfBeast extends Beast {

    private final String helpType;

    public ElfBeast(ElfBeast beast) {
        super(beast);
        this.helpType = beast.helpType;
    }

    @Override
    public String toString() {
        return "Elven eagle helps in " + helpType;
    }
}
