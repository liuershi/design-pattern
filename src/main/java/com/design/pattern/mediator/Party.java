package com.design.pattern.mediator;

/**
 * Party interface.
 *
 * @author zhangwei151
 * @date 2022/11/28 14:05
 */
public interface Party {

    void addMember(PartyMember member);

    void act(PartyMember member, Action action);
}
