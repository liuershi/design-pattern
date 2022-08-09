package com.design.pattern.single;

/**
 * 饿汉式单例模式 ： 以空间换时间
 *
 * @Author milindeyu
 * @Date 2022/8/9 11:48 下午
 * @Version 1.0
 */
public class NonLazyLoadSingle {

    private static final NonLazyLoadSingle INSTANCE = new NonLazyLoadSingle();

    /**
     * 私有构造方法控制权限
     */
    private NonLazyLoadSingle(){}

    /**
     * 全局的对象访问点
     * 优点：快速，类加载完成时就创建完成，直接获取即可，类加载时的并发问题虚拟机解决，效率较高
     * 缺点：浪费资源，不管对象是否使用，都需要在类加载时使用
     * @return 单例对象
     */
    public static NonLazyLoadSingle getInstance() {
        return INSTANCE;
    }
}
