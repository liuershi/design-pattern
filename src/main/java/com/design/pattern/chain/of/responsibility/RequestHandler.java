package com.design.pattern.chain.of.responsibility;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author milindeyu
 * @Date 2022/10/16 11:05 下午
 * @Version 1.0
 */
@Slf4j
public abstract class RequestHandler {

    private final RequestHandler next;

    public RequestHandler(RequestHandler next) {
        this.next = next;
    }

    protected void handlerRequest(Request request) {
        if (request != null) {
            next.handlerRequest(request);
        }
    }

    protected void printHandling(Request request) {
        log.info("{} handling request \"{}\"", this, request);
    }

    @Override
    public abstract String toString();
}
