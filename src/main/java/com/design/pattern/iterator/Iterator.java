package com.design.pattern.iterator;

/**
 * Iterator interface to be implemented by iterators over various data structures.
 *
 * @author zhangwei151
 * @date 2022/11/28 10:53
 */
public interface Iterator<E> {

    boolean hasNext();

    E next();
}
