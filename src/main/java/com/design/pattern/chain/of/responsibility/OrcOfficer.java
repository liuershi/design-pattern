package com.design.pattern.chain.of.responsibility;

/**
 * @Author milindeyu
 * @Date 2022/10/16 11:10 下午
 * @Version 1.0
 */
public class OrcOfficer extends RequestHandler {

    public OrcOfficer(RequestHandler handler) {
        super(handler);
    }

    @Override
    protected void handlerRequest(Request request) {
        if (request.getRequestType() == RequestType.TORTURE_PRISONER) {
            printHandling(request);
            request.markHandled();
        } else {
            super.handlerRequest(request);
        }
    }

    @Override
    public String toString() {
        return "Orc officer";
    }
}
