package com.design.pattern.chain.of.responsibility;

/**
 * @Author milindeyu
 * @Date 2022/10/16 11:10 下午
 * @Version 1.0
 */
public class OrcCommander extends RequestHandler {

    public OrcCommander(RequestHandler handler) {
        super(handler);
    }

    @Override
    protected void handlerRequest(Request request) {
        if (request.getRequestType() == RequestType.DEFEND_CASTLE) {
            printHandling(request);
            request.markHandled();
        } else {
            super.handlerRequest(request);
        }
    }

    @Override
    public String toString() {
        return "Orc commander";
    }
}
