package com.design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author milindeyu
 * @Date 2022/10/11 11:05 下午
 * @Version 1.0
 */
public abstract class LetterComposite {

    private final List<LetterComposite> children = new ArrayList<>();

    public void add(LetterComposite composite) {
        children.add(composite);
    }

    public int count() {
        return children.size();
    }

    protected void printThisBefore(){}

    protected void printThisAfter(){}

    public void print() {
        this.printThisBefore();
        children.forEach(LetterComposite::print);
        this.printThisAfter();
    }
}
