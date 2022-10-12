package com.design.pattern.composite;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author milindeyu
 * @Date 2022/10/11 11:20 下午
 * @Version 1.0
 */
@Slf4j
public class App {

    /**
     * program entry point
     *
     * @param args
     */
    public static void main(String[] args) {
        Messenger messenger = new Messenger();

        log.info("message from the orcs:");
        messenger.messageFromOrcs().print();

        log.info("message from the elves:");
        messenger.messageFromElves().print();
    }
}
