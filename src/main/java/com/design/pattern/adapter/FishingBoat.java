package com.design.pattern.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * Device class (adapter in the pattern). We want to reuse this class.
 * Fishing boat moves by sailing.
 *
 * @author zhangwei151
 * @date 2022/9/24 23:32
 */
@Slf4j
public class FishingBoat {

    void sail() {
        log.info("The fishing boat is sailing.");
    }
}
