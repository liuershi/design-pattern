package com.design.pattern.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Party implements.
 *
 * @author zhangwei151
 * @date 2022/11/28 14:14
 */
public class PartyImpl implements Party {

    private final List<PartyMember> members;

    public PartyImpl() {
        this.members = new ArrayList<>();
    }

    @Override
    public void addMember(PartyMember member) {
        members.add(member);
        member.joinPartyMember(this);
    }

    @Override
    public void act(PartyMember member, Action action) {
        for (var cMember : members) {
            if (!cMember.equals(member)) {
                cMember.partyAction(action);
            }
        }
    }
}
