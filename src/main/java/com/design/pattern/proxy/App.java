package com.design.pattern.proxy;


/**
 * @author zhangwei151
 * @date 2022/10/13 14:09
 */
public class App {

    public static void main(String[] args) {
        var proxy = new WizardTowerProxy(new IvoryTower());
        proxy.enter(new Wizard("Red wizard"));
        proxy.enter(new Wizard("White wizard"));
        proxy.enter(new Wizard("Black wizard"));
        proxy.enter(new Wizard("Green wizard"));
        proxy.enter(new Wizard("Brown wizard"));
    }
}
