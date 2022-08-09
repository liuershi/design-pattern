package com.design.pattern.single;

/**
 * 懒汉式单例模式 ： 以空间换时间
 *
 * @Author milindeyu
 * @Date 2022/8/9 11:41 下午
 * @Version 1.0
 */
public class LazyLoadSingle {

    /**
     * 需要用volatile修饰，防止重排序导致的对象未初始化完毕被使用出现异常
     */
    private static volatile LazyLoadSingle INSTANCE;

    /**
     * 将构造方法私有化，控制创建对象的全，防止在外部创建对象导致多实例
     */
    private LazyLoadSingle() {}


    /**
     * 优点：相对于饿汉式，在需要的时候才创建，节约了资源
     * 缺点：1.使用了volatile，该关键字会禁止编译器的重排序优化，导致效率没那么高
     *      2.使用synchronized防止并发问题，但是会降低效率
     *      3.每次获取对象的时候都取判断对象是否为空，多余的判断降低效率
     * @return
     */
    public static LazyLoadSingle getInstance() {
        // 基于dlc（double lock check）实现
        if (INSTANCE == null) {
            synchronized (LazyLoadSingle.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazyLoadSingle();
                }
            }
        }
        return INSTANCE;
    }
}
