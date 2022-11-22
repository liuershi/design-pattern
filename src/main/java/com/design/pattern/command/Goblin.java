package com.design.pattern.command;

/**
 * Goblin is the target of the spell.
 *
 * @author zhangwei151
 * @date 2022/11/22 10:43
 */
public class Goblin extends Target {

    public Goblin() {
        setSize(Size.NORMAL);
        setVisibility(Visibility.VISIBLE);
    }

    @Override
    public String toString() {
        return "Goblin";
    }
}
