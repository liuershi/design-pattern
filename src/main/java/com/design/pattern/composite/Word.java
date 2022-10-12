package com.design.pattern.composite;

import java.util.List;

/**
 * @Author milindeyu
 * @Date 2022/10/11 11:09 下午
 * @Version 1.0
 */
public class Word extends LetterComposite {

    public Word(List<Letter> letters) {
        letters.forEach(this::add);
    }

    public Word(char... letters) {
        for (char letter : letters) {
            add(new Letter(letter));
        }
    }

    @Override
    protected void printThisBefore() {
        System.out.print(" ");
    }
}
