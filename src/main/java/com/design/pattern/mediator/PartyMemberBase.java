package com.design.pattern.mediator;

import lombok.extern.slf4j.Slf4j;

/**
 * Abstract base class for party members.
 *
 * @author zhangwei151
 * @date 2022/11/28 14:06
 */
@Slf4j
public abstract class PartyMemberBase implements PartyMember {

    protected Party party;

    @Override
    public void joinPartyMember(Party party) {
        log.info("{} joins the party", this);
        this.party = party;
    }

    @Override
    public void partyAction(Action action) {
        log.info("{} {}", this, action.getDescription());
    }

    @Override
    public void act(Action action) {
        if (party != null) {
            log.info("{} {}", this, action);
            party.act(this, action);
        }
    }

    @Override
    public abstract String toString();
}
