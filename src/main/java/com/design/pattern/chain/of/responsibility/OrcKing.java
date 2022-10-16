package com.design.pattern.chain.of.responsibility;

/**
 * OrcKing makes requests that are handled by the chain.
 *
 * @Author milindeyu
 * @Date 2022/10/16 11:13 下午
 * @Version 1.0
 */
public class OrcKing {

    private RequestHandler chain;

    public OrcKing() {
        buildChain();
    }

    /**
     * build request handler the chain.
     */
    private void buildChain() {
        this.chain = new OrcCommander(new OrcOfficer(new OrcSoldier(null)));
    }

    public void makeRequest(Request request) {
        this.chain.handlerRequest(request);
    }
}
