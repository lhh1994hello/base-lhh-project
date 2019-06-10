package com.base.gof.single;

/**
 * @author lhh
 * @date 2019/6/4 17:39
 * @Description: 单例模式
 */
public class Singleton {
    private static Singleton singleton;
    private static Singleton methodLockInstance;
    private static Singleton areaLockInstance;


    private Singleton() {
    }

    //给出一个公共的静态方法返回一个单一实例，不考虑并发问题
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    //线程安全的，但是效率比较低，对整个方法上锁
    public synchronized static Singleton getMethodLockInstance() {
        if (methodLockInstance == null) {
            methodLockInstance = new Singleton();
        }
        return methodLockInstance;
    }

    //对部分代码进行上锁，效率会提高很多，因为只在最开始为null，之后if判断就不成立了
    //外层判断为了尽量避免上锁，内层判断避免并发问题
    public synchronized static Singleton getAreaLockInstance() {
        if (areaLockInstance == null) {
            synchronized (Singleton.class) {
                if (areaLockInstance == null) {
                    areaLockInstance = new Singleton();
                }
            }
        }
        return areaLockInstance;
    }


    //使用静态内部类
    public static Singleton getInnerClassInstance() {
        return SingletonInstance.instance;
    }

    //定义一个静态内部类
    private static class SingletonInstance {
        static Singleton instance = new Singleton();
    }


}
