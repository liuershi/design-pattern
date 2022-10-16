package com.design.pattern.chain.of.responsibility;

import java.util.Objects;

/**
 * @Author milindeyu
 * @Date 2022/10/16 10:58 下午
 * @Version 1.0
 */
public class Request {

    /**
     * The type this request, used by each item in the chain to
     * see if they should or can handle this particular request.
     */
    private final RequestType requestType;

    /**
     * A description of the request.
     */
    private final String requestDescription;

    /**
     * Indicates if the request is handled or not. A request can only
     * switch state from unhandled to handled. there's no way to 'unhandle'
     * a request.
     */
    private boolean handled;

    public Request(RequestType requestType, String requestDescription) {
        this.requestType = Objects.requireNonNull(requestType);
        this.requestDescription = Objects.requireNonNull(requestDescription);
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public String getRequestDescription() {
        return requestDescription;
    }

    /**
     * Mark the request as handled.
     */
    public void markHandled() {
        this.handled = true;
    }

    public boolean isHandled() {
        return handled;
    }

    @Override
    public String toString() {
        return getRequestDescription();
    }
}
