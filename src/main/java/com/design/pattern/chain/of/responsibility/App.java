package com.design.pattern.chain.of.responsibility;

/**
 * @Author milindeyu
 * @Date 2022/10/16 11:17 下午
 * @Version 1.0
 */
public class App {

    /**
     * Program entry point.
     *
     * @param args
     */
    public static void main(String[] args) {
        var king = new OrcKing();
        king.makeRequest(new Request(RequestType.DEFEND_CASTLE, "defend castle"));
        king.makeRequest(new Request(RequestType.TORTURE_PRISONER, "torture prisoner"));
        king.makeRequest(new Request(RequestType.COLLECT_TAX, "collect tax"));
    }
}
