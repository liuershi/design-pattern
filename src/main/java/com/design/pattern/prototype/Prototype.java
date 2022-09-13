package com.design.pattern.prototype;

import lombok.SneakyThrows;

/**
 * @author zhangwei151
 * @date 2022/9/13 10:57
 */
public abstract class Prototype<T> implements Cloneable {

    /**
     * object a shallow copy of this object or null if this object is not cloneable.
     */
    @SuppressWarnings("unchecked")
    @SneakyThrows
    public T copy() {
        return (T) super.clone();
    }
}
