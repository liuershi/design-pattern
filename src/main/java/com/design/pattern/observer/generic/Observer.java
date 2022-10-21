package com.design.pattern.observer.generic;

/**
 * Observer.
 *
 * @author zhangwei151
 * @date 2022/10/20 18:23
 * @param <S> Observable
 * @param <O> Observer
 * @param <A> Action
 */
public interface Observer<S extends Observable<S, O, A>, O extends  Observer<S, O, A>, A> {

    void update(S subject, A argument);
}
