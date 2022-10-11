package com.design.pattern.composite;

import java.util.List;

/**
 * @Author milindeyu
 * @Date 2022/10/11 11:12 下午
 * @Version 1.0
 */
public class Sentence extends LetterComposite {

    public Sentence(List<Word> words) {
        words.forEach(this::add);
    }

    @Override
    protected void printThisAfter() {
        System.out.println(".");
    }
}
