package com.design.pattern.template.method;

/**
 * @author zhangwei151
 * @date 2022/11/28 15:00
 */
public class App {

    /**
     * Program entry point.
     *
     * @param args
     */
    public static void main(String[] args) {
        StealingMethod method = new SubtleMethod();

        var thief = new HalflingThief(method);

        thief.steal();

        method = new HitAndRunMethod();
        thief.changeMethod(method);

        thief.steal();
    }
}
