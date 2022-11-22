package com.design.pattern.command;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * Base class form spell targets.
 *
 * @author zhangwei151
 * @date 2022/11/22 10:12
 */
@Setter
@Getter
@Slf4j
public abstract class Target {

    private Size size;

    private Visibility visibility;

    public void printStatus() {
        log.info("{}, [size={}], [visibility={}]", this, getSize(), getVisibility());
    }

    public void changeSize() {
        var oldSize = getSize() == Size.NORMAL ? Size.SMALL : Size.NORMAL;
        setSize(oldSize);
    }

    public void changeVisibility() {
        var oldVisibility = getVisibility() == Visibility.VISIBLE ? Visibility.INVISIBLE : Visibility.VISIBLE;
        setVisibility(oldVisibility);
    }
}
