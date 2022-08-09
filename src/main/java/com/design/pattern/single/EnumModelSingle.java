package com.design.pattern.single;

/**
 * 按照《Effective Java》中的说法，单例模式的最佳实践是
 * 通过单元素的枚举类型实现。
 *
 * @Author milindeyu
 * @Date 2022/8/10 12:07 上午
 * @Version 1.0
 */
public enum EnumModelSingle {
    /**
     * 单例对象：该对象类型就为EnumModelSingle本身
     */
    INSTANCE;

    /**
     * 优点：使用枚举来实现单例控制会使代码更加简洁，而且无偿提供了
     * 序列化机制，并有jvm从根本上提供了保障，是更简洁、高效、安全
     * 的单例实现方式。
     */


    /**
     * 定义的操作
     */
    public void operation() {
        // something
    }
}
