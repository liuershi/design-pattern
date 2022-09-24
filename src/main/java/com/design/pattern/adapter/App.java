package com.design.pattern.adapter;


/**
 * @author zhangwei151
 * @date 2022/9/24 23:36
 */
public class App {

    /**
     * Program entry point.
     */
    public static void main(String[] args) {
        var captain = new Captain(new FishingBoatAdapter(new FishingBoat()));
        captain.row();
    }
}
