package com.design.pattern.mediator;

/**
 * Interface for party members interacting with {@link Party}.
 *
 * @author zhangwei151
 * @date 2022/11/28 14:06
 */
public interface PartyMember {

    void joinPartyMember(Party party);

    void partyAction(Action action);

    void act(Action action);
}
