package com.design.pattern.proxy;

import lombok.RequiredArgsConstructor;

/**
 * Wizard
 *
 * @author zhangwei151
 * @date 2022/10/13 11:45
 */
@RequiredArgsConstructor
public class Wizard {

    private final String name;

    @Override
    public String toString() {
        return name;
    }
}
