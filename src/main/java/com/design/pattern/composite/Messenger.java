package com.design.pattern.composite;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author milindeyu
 * @Date 2022/10/11 11:13 下午
 * @Version 1.0
 */
public class Messenger {

    LetterComposite messageFromOrcs() {
        List<Word> words = Stream.of(
                new Word('W', 'h', 'e', 'r', 'e'),
                new Word('t', 'h', 'e', 'r', 'e'),
                new Word('i', 's'),
                new Word('a'),
                new Word('w', 'h', 'i', 'p'),
                new Word('t', 'h', 'e', 'r', 'e'),
                new Word('i', 's'),
                new Word('a'),
                new Word('w', 'a', 'y')
        ).collect(Collectors.toList());

        return new Sentence(words);
    }

    LetterComposite messageFromElves() {
        List<Word> words = Stream.of(
                new Word('M', 'u', 'c', 'h'),
                new Word('w', 'i', 'n', 'd'),
                new Word('p', 'o', 'u', 'r', 's'),
                new Word('f', 'r', 'o', 'm'),
                new Word('y', 'o', 'u', 'r'),
                new Word('m', 'o', 'u', 't', 'h')
        ).collect(Collectors.toList());

        return new Sentence(words);
    }
}
