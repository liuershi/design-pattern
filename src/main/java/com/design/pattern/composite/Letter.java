package com.design.pattern.composite;

/**
 * @Author milindeyu
 * @Date 2022/10/11 11:08 下午
 * @Version 1.0
 */
public class Letter extends LetterComposite {

    private final char letter;

    public Letter(char letter) {
        this.letter = letter;
    }

    @Override
    protected void printThisBefore() {
        System.out.println(letter);
    }
}
