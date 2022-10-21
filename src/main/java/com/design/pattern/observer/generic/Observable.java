package com.design.pattern.observer.generic;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Generic observer inspired by Generics and Collection by {@literal Naftalin & Wadler}.
 *
 * @author zhangwei151
 * @date 2022/10/20 18:25
 * @param <S> Subject
 * @param <O> Observer
 * @param <A> Action
 */
public abstract class Observable<S extends Observable<S, O, A>, O extends Observer<S, O, A>, A> {

    protected final List<O> observers;

    public Observable() {
        this.observers = new CopyOnWriteArrayList<>();
    }

    public void addObserver(O obs) {
        this.observers.add(obs);
    }

    public void removeObserver(O obs) {
        this.observers.remove(obs);
    }

    /**
     * Notify observers.
     */
    @SuppressWarnings("unchecked")
    public void notifyObservers(A argument) {
        this.observers.forEach(observer -> observer.update((S) this, argument));
    }
}
