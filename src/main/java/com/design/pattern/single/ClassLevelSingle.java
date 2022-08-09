package com.design.pattern.single;

/**
 * 基于静态内部类实现：综合懒汉和饿汉式的优点实现
 *
 * @Author milindeyu
 * @Date 2022/8/9 11:52 下午
 * @Version 1.0
 */
public class ClassLevelSingle {

    /**
     * 私有构造方法控制权限
     */
    private ClassLevelSingle() {}

    /**
     * 过程：当我们调用该方法时，会去调用静态内部类的静态变量，先加载静态内部类，而该静态变量类型为
     * 外部的单例对象类型，而由于是静态变量，所以jvm会保证线程安全，此时创建的外部单例对象
     * 是唯一且线程安全的。
     *
     * 优点：该模式优势在于并为加同步锁，并未加判断，因此延迟加载并未增加任何成本。
     *
     * @return
     */
    public static ClassLevelSingle getInstance() {
        return InnerClassLevelSingle.INSTANCE;
    }

    static class InnerClassLevelSingle {
        /**
         * 静态变量，jvm保证线程安全
         */
        private static final ClassLevelSingle INSTANCE = new ClassLevelSingle();
    }
}
