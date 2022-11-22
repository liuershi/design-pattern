package com.design.pattern.command;

import lombok.RequiredArgsConstructor;

/**
 * Enumeration for target size.
 *
 * @author zhangwei151
 * @date 2022/11/22 10:06
 */
@RequiredArgsConstructor
public enum Size {

    SMALL("small"),

    NORMAL("normal");

    private final String code;


    @Override
    public String toString() {
        return code;
    }
}
