package com.design.pattern.chain.of.responsibility;

/**
 * @Author milindeyu
 * @Date 2022/10/16 11:09 下午
 * @Version 1.0
 */
public class OrcSoldier extends RequestHandler {

    public OrcSoldier(RequestHandler handler) {
        super(handler);
    }

    @Override
    protected void handlerRequest(Request request) {
        if (request.getRequestType() == RequestType.COLLECT_TAX) {
            printHandling(request);
            request.markHandled();
        } else {
            super.handlerRequest(request);
        }
    }

    @Override
    public String toString() {
        return "Orc soldier";
    }
}
