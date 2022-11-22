package com.design.pattern.command;

import lombok.RequiredArgsConstructor;

/**
 * Enumeration for target visibility.
 *
 * @author zhangwei151
 * @date 2022/11/22 10:07
 */
@RequiredArgsConstructor
public enum Visibility {

    VISIBLE("visible"),

    INVISIBLE("invisible");

    private final String code;


    @Override
    public String toString() {
        return code;
    }
}
